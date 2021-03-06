
import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
/**
 * This class contains the group of text fields representing the cars information visually
 * inside a panel.
 * @
 *
 * PUBLIC FEATURES:
 * // Constructors
 *    public CarDetailsComponents()
 *
 * // Methods
 *    public void clearTextFields()
 *    public void componentHidden(ComponentEvent ev)
 *    public void componentMoved(ComponentEvent ev)
 *    public void componentResized(ComponentEvent ev)
 *    public void componentShown(ComponentEvent ev)
 *    public void displayDetails(Car c)
 *    public JPanel getDetailsPanel()
 *    public String getInfoText()
 *    public String getKmText()
 *    public String getManufacturerText()
 *    public String getModelText()
 *    public String getPriceText()
 *    public String getYearText()
 *    public void setFocusManufacturerTextField()
 *    public String getFotoText()
 *    public Date getLastService() throws ParseException
 *
 */
public class CarDetailsComponents extends JPanel implements ComponentListener
{

	private JLabel manufacturerLabel = new JLabel(Language.getFabricante());
	private JLabel yearLabel = new JLabel(Language.getAnio());
	private JLabel modelLabel = new JLabel(Language.getModelo());
	private JLabel priceLabel = new JLabel(Language.getPrecio());
	private JLabel kmLabel = new JLabel(Language.getKM());
	private JLabel infoLabel = new JLabel(Language.getInfoExtra());
	private JLabel lastServiceLabel = new JLabel(Language.getUltimoServicio());
	private JTextField manufacturerTextField = new JTextField();
	
	private JTextField yearTextField = new JTextField();
	private JTextField modelTextField = new JTextField();
	private JTextField priceTextField = new JTextField();
	private JTextField kmTextField = new JTextField();
	private DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
	private JFormattedTextField lastServiceField = new JFormattedTextField(formateador);
	private JTextArea infoTextArea = new JTextArea(4, 0);
	private JLabel fotoLabel = new JLabel(Language.getFoto());
 	private JTextField fotoTextField = new JTextField();
	
	private final int divFactor = 27;

	/**
	 * set up a new CarDetailComponents object and return a reference to the object which is a kind
	 * of panel
	 */
	public CarDetailsComponents()
	{
		Insets currentInsets;
		GridBagConstraints gridBagConstraints;
		setLayout(new BorderLayout(0, 20));
		JPanel compPanel = new JPanel(new GridBagLayout());
		String currentFont = manufacturerLabel.getFont().getName();
		currentInsets =  new Insets(0, 10, 0, 30);

		manufacturerLabel.setFont(new Font(currentFont, Font.BOLD, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = currentInsets;
        compPanel.add(manufacturerLabel, gridBagConstraints);

        yearLabel.setFont(new Font(currentFont, Font.BOLD, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = currentInsets;
        compPanel.add(yearLabel, gridBagConstraints);

        modelLabel.setFont(new Font(currentFont, Font.BOLD, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = currentInsets;
        compPanel.add(modelLabel, gridBagConstraints);

        priceLabel.setFont(new Font(currentFont, Font.BOLD, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = currentInsets;
        compPanel.add(priceLabel, gridBagConstraints);

        kmLabel.setFont(new Font(currentFont, Font.BOLD, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = currentInsets;
        compPanel.add(kmLabel, gridBagConstraints);

        lastServiceLabel.setFont(new Font(currentFont, Font.BOLD, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = currentInsets;
        compPanel.add(lastServiceLabel, gridBagConstraints);

	
	fotoLabel.setFont(new Font(currentFont, Font.BOLD, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = currentInsets;
        compPanel.add(fotoLabel, gridBagConstraints);
        
        infoLabel.setFont(new Font(currentFont, Font.BOLD, 12));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.insets = currentInsets;
        compPanel.add(infoLabel, gridBagConstraints);

        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        compPanel.add(manufacturerTextField, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        compPanel.add(yearTextField, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        compPanel.add(modelTextField, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagConstraints.anchor = GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        compPanel.add(priceTextField, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagConstraints.anchor = gridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        kmTextField.setColumns(20);
        compPanel.add(kmTextField, gridBagConstraints);
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
		gridBagConstraints.anchor = gridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        lastServiceField.setColumns(20);
        lastServiceField.setText("dd/MM/AAAA");
        compPanel.add(lastServiceField, gridBagConstraints);
        
	

	 gridBagConstraints = new GridBagConstraints();
         gridBagConstraints.gridx = 1;
         gridBagConstraints.gridy = 6;
         gridBagConstraints.gridwidth = GridBagConstraints.RELATIVE;
 		gridBagConstraints.anchor = gridBagConstraints.WEST;
         gridBagConstraints.weightx = 1.0;
         compPanel.add(fotoTextField, gridBagConstraints);

		infoTextArea.setLineWrap(true);
		currentInsets = new Insets(2, 20, 0, 20);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = gridBagConstraints.WEST;
		gridBagConstraints.weightx = 1.0;
        compPanel.add(new JScrollPane(infoTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER), gridBagConstraints);

	
		// this listens for resize events
		addComponentListener(this);
        add(compPanel, "North");
	}

	/**
	 * clear all the text fields
	 */
	public void clearTextFields()
	{
		manufacturerTextField.setText("");
		yearTextField.setText("");
		modelTextField.setText("");
		priceTextField.setText("");
		kmTextField.setText("");
		infoTextArea.setText("");
		lastServiceField.setText("");
		fotoTextField.setText("");
	}

	public void componentHidden(ComponentEvent ev) {}

	public void componentMoved(ComponentEvent ev) {}

	/**
	 * when the details panel is resized change the length of the text boxes
	 *
	 * @return ev ComponentEvent object
	 */
	public void componentResized(ComponentEvent ev)
	{
		if (ev.getSource() == this)
		{
			int width = getWidth();

			if (width >= 0)
			{
				/** these text fields had to be resized manually. Using insets didn't work for
				smaller areas of the panel. */
				manufacturerTextField.setColumns(width / divFactor);
				yearTextField.setColumns(width / divFactor);
				modelTextField.setColumns(width / divFactor);
				priceTextField.setColumns(width / divFactor);
				kmTextField.setColumns(width / divFactor);
				infoTextArea.setColumns((width / divFactor) + 3); // this text box is larger
				lastServiceField.setColumns(width /divFactor);
				fotoTextField.setColumns(width / divFactor);
			}
		}
	}

	public void componentShown(ComponentEvent ev){}

	/**
	 * display details about a car through the text box components
	 *
	 * @param c the car to display details about
	 */
	public void displayDetails(Car c)
	{
		manufacturerTextField.setText(c.getManufacturer());
		yearTextField.setText(Integer.toString(c.getYear()));
		modelTextField.setText(c.getModel());
		priceTextField.setText(Double.toString(c.getPrice()));
		kmTextField.setText(Double.toString(c.getKilometers()));
		infoTextArea.setText(c.getInformation());
		lastServiceField.setText(c.getLastService().toString());
		fotoTextField.setText(c.getPhoto());
	}

	public String getInfoText()
	{
		return infoTextArea.getText();
	}

	public String getKmText()
	{
		return kmTextField.getText();
	}

	public String getManufacturerText()
	{
		return manufacturerTextField.getText();
	}

	public String getModelText()
	{
		return modelTextField.getText();
	}

	public String getPriceText()
	{
		return priceTextField.getText();
	}

	public String getYearText()
	{
		return yearTextField.getText();
	}
	
	public Date getLastService() throws ParseException
	{
		String sd = lastServiceField.getText();
		Date d = new Date();
		d = formateador.parse(sd);
		return d;
	}
	public String getFotoText() {
  		
  		return fotoTextField.getText();
  	}

	/**
	 * set focus to the manufacturer text field. ie, put the cursor inside it
	 */
	public void setFocusManufacturerTextField()
	{
		manufacturerTextField.grabFocus();
	}
}
