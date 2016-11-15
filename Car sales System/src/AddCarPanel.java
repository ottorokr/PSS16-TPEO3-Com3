import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

import javax.swing.*;
/**
 * The panel used for adding cars to the CarSalesSystem
 * @
 *
 * PUBLIC FEATURES:
 * // Constructors
 *    public AddCarPanel(CarSalesSystem carSys, JPanel dest)
 *
 * // Methods
 *    public void actionPerformed(ActionEvent ev)
 *
 * COLLABORATORS:
 *    CarDetailComponents
 *
 * @version 1.0, 16 Oct 2004
 * @author Adam Black
 */
public class AddCarPanel extends JPanel implements ActionListener
{
	private CarSalesSystem carSystem;
	private JLabel headingLabel = new JLabel("Agregar un auto");
	private JButton resetButton = new JButton("Reiniciar");
	private JButton saveButton = new JButton("Guardar");
	private JPanel buttonPanel = new JPanel();
	private CarDetailsComponents carComponents = new CarDetailsComponents();

	/**
	 * @param carSys links to a CarSalesSystem object
	 * @param dest where the components will be placed
	 */
	public AddCarPanel(CarSalesSystem carSys)
	{
		carSystem = carSys;

		resetButton.addActionListener(this);
		saveButton.addActionListener(this);
		headingLabel.setAlignmentX(0.5f);

		buttonPanel.add(resetButton);
		buttonPanel.add(saveButton);

		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		add(Box.createVerticalStrut(10));
		add(headingLabel);
		add(Box.createVerticalStrut(15));
		carComponents.add(buttonPanel, "Center");
		add(carComponents);
	}

	/**
	 * check which buttons were pressed
	 *
	 * @param ev ActionEvent object
	 */
	public void actionPerformed(ActionEvent ev)
	{
		if (ev.getSource() == resetButton)
			resetButtonClicked();
		else if (ev.getSource() == saveButton)
			saveButtonClicked();
	}

	private void resetButtonClicked()
	{
		carComponents.clearTextFields();
	}

	private void saveButtonClicked()
	{
		String manufacturer = "";
		String model = "";
		String info = "";
		double kilometers = 0;
		int price = 0;
		int year = 0;
		Date lastService = new Date();
		boolean valid = false;
		String photo = "";
		try
		{
			/* retrieve all the values from the text field, and convert them into an appropriate
			format */
			manufacturer = carComponents.getManufacturerText().trim();
			model = carComponents.getModelText().trim();
			info = carComponents.getInfoText().trim();
			kilometers = Double.parseDouble(carComponents.getKmText().trim());
			price = Integer.parseInt(carComponents.getPriceText().trim());
			year = Integer.parseInt(carComponents.getYearText().trim());lastService = carComponents.getLastService();
			photo = carComponents.getFotoText();
			// begin validation process
			if (validateString(manufacturer))
			{
				if (year >= 1000 && year <= 9999)
				{
					if (validateString(model))
					{
						if (validateKilometers(carComponents.getKmText().trim()))
						{

							if (validatePhoto(carComponents.getFotoText().trim()))
  							   valid = true;
  							else
  								JOptionPane.showMessageDialog(carSystem, "Ocurrio un error debido a campos incorrectos en el campo  \"Foto del vehículo\".\nEste campo debe contener una cadena de al menos 6 caracteres que no sean espacios.", "Campo invalido", JOptionPane.ERROR_MESSAGE);
  					
						}
						else
							JOptionPane.showMessageDialog(carSystem, "Un error ha ocurrido debido a un valor incorrecto en el campo \"Kilometraje\".\nEste campo de texto debe contener un número con un solo decimal.", "Campo inválido", JOptionPane.ERROR_MESSAGE);
					}
					else
						JOptionPane.showMessageDialog(carSystem, "Un error ha ocurrido debido a un valor incorrecto en el campo \"Modelo\".\nEste campo de texto debe contener cualquier cadena de al menos dos caracteres distintos del espacio.", "Campo inválido", JOptionPane.ERROR_MESSAGE);
				}
				else
					JOptionPane.showMessageDialog(carSystem, "Un error ha ocurrido debido a un valor incorrecto en el campo \"Año\".\nEste campo de texto debe estar en la forma, AAAA. Es decir, 2007.", "Campo inválido", JOptionPane.ERROR_MESSAGE);
			}
			else
				JOptionPane.showMessageDialog(carSystem, "Un error ha ocurrido debido a un valor incorrecto en el campo \"Fabricante\".\nEste campo de texto debe contener cualquier cadena de al menos dos caracteres distintos del espacio.", "Campo inválido", JOptionPane.ERROR_MESSAGE);

		}
		/* NumberFormatException would usually be thrown if the text fields contain invalid data,
		for example a price field containing letters.*/
		catch (NumberFormatException exp)
		{
			JOptionPane.showMessageDialog(carSystem, "Un error desconocido ha ocurrido. Por favor asegurate de que tus campos cumplan los siguientes requerimientos:\n" +
			"El campo \"Año\" debe contener solo cuatro dígitos numéricos\nEl campo \"Precio\" debe contener un entero válido sin decimales\nEl campo \"Kilometraje\" debe contener un número con un máximo de un decimal", "Campo inválido", JOptionPane.ERROR_MESSAGE);
		}
		/*
		 * Se captura la excepcion por si el formato de la fecha no es válido
		 */
		catch(ParseException e){
			JOptionPane.showMessageDialog(carSystem, "The format of the date is not valid", "Invalid field", JOptionPane.ERROR_MESSAGE);

		}

		if (valid)
		{
			// create a car object from validated data.
			Car myCar = new Car(manufacturer, model, info,lastService);
			myCar.setKilometers(kilometers);
			myCar.setPrice(price);
			myCar.setYear(year);
			myCar.setLastService(lastService);

			// attempt to add the new car to the system.
			int result = carSystem.addNewCar(myCar);

			// if the car was added successfully
			if (result == CarsCollection.NO_ERROR)
			{
				carSystem.setCarsUpdated();
				JOptionPane.showMessageDialog(carSystem, "Registro agregado", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
				resetButtonClicked();
				carComponents.setFocusManufacturerTextField();
			}
			// for that manufacturer, the limit has been reached
			else if (result == CarsCollection.CARS_MAXIMUM_REACHED)
				JOptionPane.showMessageDialog(carSystem, "El número máximo de autos para ese fabricante ha sido alcanzado.\nDesafortunadamente no puedes agregar más autos a este fabricante", "Problema agregando auto", JOptionPane.WARNING_MESSAGE);
			// the car system has reached the maximum number of manufacturers allowed
			else if (result == CarsCollection.MANUFACTURERS_MAXIMUM_REACHED)
				JOptionPane.showMessageDialog(carSystem, "El número máximo de fabricantes para el sistema de autos ha sido alcanzado.\nDesafortunadamente no puedes agregar más fabricantes a este sistema.", "Problema agregando auto", JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * checks the argument. It is valid if there is more than 2 non-spaced characters.
	 *
	 * @param arg string to test
	 * @return true if valid, false otherwise
	 */
	private boolean validateString(String arg)
	{
		boolean valid = false;
		String[] splitted = arg.split(" "); // splits argument around spaces and creates an array

		for (int i = 0; i < splitted.length; i++)
		{
			// checks if the number of characters between a space is greater than 2
			valid = (splitted[i].length() > 2);
			if (valid)
				break;
		}

		return valid;
	}

	/**
	 * checks the argument It is valid if it contains a decimal value, with only one decimal place
	 *
	 * @param distance a double value expressed in a string
	 * @return true if valid, false otherwise
	 */
	private boolean validateKilometers(String distance)
	{
		boolean valid = false;
		String rem;
		StringTokenizer tokens = new StringTokenizer(distance, "."); // look for decimal point

		tokens.nextToken();

		if (tokens.hasMoreTokens()) // if true, there is a decimal point present
		{
			// get string representation of all numbers after the decimal point
			rem = tokens.nextToken();
			// if there's only one number after the decimal point, then it's valid
			if (rem.length() == 1)
				valid = true;
			else
			{
				// check if the user has typed something like 3.00, or even 3.00000
				if ((Integer.parseInt(rem)) % (Math.pow(10, rem.length() - 1)) == 0)
					valid = true;
				else
					valid=false;
			}
		}
		else // doesn't have a decimal place
			valid = true;

		return valid;
	}
	
	private boolean validatePhoto(String arg)
 	{
 		boolean valid = false;
 		String[] splitted = arg.split(" "); // splits argument around spaces and creates an array
 
 		for (int i = 0; i < splitted.length; i++)
  		{
  			// checks if the number of characters between a space is greater than 2
  			valid = (splitted[i].length() > 5);
  			if (valid)
  				break;
  		}
  
  		return valid;
  	}
}
