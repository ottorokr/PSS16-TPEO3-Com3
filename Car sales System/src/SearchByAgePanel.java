import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * A panel used for obtaining search parameters using car age
 * @
 *
 * PUBLIC FEATURES:
 * // Constructors
 *    public SearchByAgePanel(CarSalesSystem carSys, JPanel dest)
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
public class SearchByAgePanel extends JPanel implements ActionListener
{
	private final String[] age = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10+"}; // <PSS-UNS> Saqué algunas edades porque eran muchas.
	private Car[] carList;
	private CarSalesSystem carSystem;
	private int currentIndex = 0;
	private JLabel headingLabel = new JLabel(Language.getLabel1());
	private JLabel ageLabel = new JLabel(Language.getLabel2());
	private JButton searchButton = new JButton(Language.getLabel3());
	private JButton resetButton = new JButton(Language.getLabel4());
	private JButton previousButton = new JButton(Language.getLabel5());
	private JButton nextButton = new JButton(Language.getLabel6());
	private JComboBox ageCombo = new JComboBox(age);
	private JPanel topPanel = new JPanel();
	private JPanel agePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel searchButtonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel navigateButtonsPanel = new JPanel();
	private CarDetailsComponents carComponents = new CarDetailsComponents();

	/**
	 * @param carSys links to a CarSalesSystem object
     * @param dest where the panel will be displayed on the main frame
     */
	public SearchByAgePanel(CarSalesSystem carSys)
	{
		carSystem = carSys;
		setLayout(new BorderLayout());
		topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

		previousButton.addActionListener(this);
		nextButton.addActionListener(this);
		resetButton.addActionListener(this);
		searchButton.addActionListener(this);

		agePanel.add(ageLabel);
		agePanel.add(ageCombo);
		searchButtonsPanel.add(searchButton);
		searchButtonsPanel.add(resetButton);
		navigateButtonsPanel.add(previousButton);
		navigateButtonsPanel.add(nextButton);
		agePanel.setBorder(new javax.swing.border.EmptyBorder(new Insets(0, 5, 0, 0)));
		searchButtonsPanel.setBorder(new javax.swing.border.EmptyBorder(new Insets(0, 5, 0, 0)));

		headingLabel.setAlignmentX(0.5f);

		topPanel.add(Box.createVerticalStrut(10));
		topPanel.add(headingLabel);
		topPanel.add(Box.createVerticalStrut(10));
		topPanel.add(agePanel);
		topPanel.add(searchButtonsPanel);
		topPanel.add(Box.createVerticalStrut(15));
		carComponents.add(navigateButtonsPanel, "Center");
		carComponents.setVisible(false);

		add(topPanel, "North");
		add(carComponents, "Center");
	}

	/**
	 * check for button clicks
	 *
	 * @param ev ActionEvent object
	 */
	public void actionPerformed(ActionEvent ev)
	{
		if (ev.getSource() == searchButton)
			searchButtonClicked();
		else if (ev.getSource() == previousButton)
			previousButtonClicked();
		else if (ev.getSource() == nextButton)
			nextButtonClicked();
		else if (ev.getSource() == resetButton)
			resetButtonClicked();
	}

	/**
	 * get next index if it exists, and display it visually using CarDetailsComponents
	 */
	private void nextButtonClicked()
	{
		if (currentIndex < carList.length - 1)
		{
			currentIndex++;
			carComponents.displayDetails(carList[currentIndex]);
		}
		else
			JOptionPane.showMessageDialog(carSystem, Language.getErrorSearch1(), Language.getAlert(), JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * get previous index if it exists, and display it visually using CarDetailsComponents
	 */
	private void previousButtonClicked()
	{
		if (currentIndex > 0)
		{
			currentIndex--;
			carComponents.displayDetails(carList[currentIndex]);
		}
		else
			JOptionPane.showMessageDialog(carSystem, Language.getErrorSearch1(), Language.getAlert(), JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * clear search results, begin next search from scratch
	 */
	private void resetButtonClicked()
	{
		currentIndex = 0;
		carList = null;
		carComponents.setVisible(false);
		ageCombo.setSelectedIndex(0);
	}

	/**
	 * find out search parameters, and do a search
	 */
	private void searchButtonClicked()
	{
		// converts a string range to a lower and upper bounds.
		double[] range = CarSalesSystem.convertToRange((String)ageCombo.getSelectedItem());

		if (range[0] >= 0)
		{
			carList = carSystem.search((int)range[0], (int)range[1]);
		}

		if (carList.length > 0)
		{
			currentIndex = 0;
			carComponents.setVisible(true);
			carComponents.displayDetails(carList[0]);

			if (carList.length == 1)
			{
				nextButton.setEnabled(false);
				previousButton.setEnabled(false);
			}
			else
			{
				nextButton.setEnabled(true);
				previousButton.setEnabled(true);
			}

			carSystem.repaint();
		}
		else
			JOptionPane.showMessageDialog(carSystem, Language.getErrorSearch2(), Language.getFailBusqueda(), JOptionPane.WARNING_MESSAGE);
	}
}
