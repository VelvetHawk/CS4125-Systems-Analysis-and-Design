package display.components;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CartListPanel extends JPanel
{
	private ArrayList<String[]> listItems;
	private ArrayList<Double> itemCosts;
	private char currencySymbol;
	private double totalAmount;
	
	// Util
	private int itemColumns;
	private int row;
	private int column;
	
	// Components
	private JLabel titleLabel;
	private JLabel totalAmountLabel;
	private GridBagConstraints constraints;
	private JPanel cartList;
	private GridLayout grid;
	private JButton addItemButton;
	
	public CartListPanel()
	{
		this("No title set", '\u20AC', 1);
	}
	
	public CartListPanel(String panelTitle, char currencySymbol, int itemColumns)
	{
		super();
		this.titleLabel = new JLabel(panelTitle);
		this.currencySymbol = currencySymbol;
		this.itemColumns = itemColumns;
		
		setBorder(new LineBorder(Color.RED)); // REMOVE LATER
		
		// Defaults
		listItems = new ArrayList<>();
		itemCosts = new ArrayList<>();
		row = 0;
		column = 0;
		
		// Build GUI
		setLayout(new GridBagLayout());
		constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		// Defaults
		constraints.weighty = 1;
		constraints.weightx = 1;
		constraints.anchor = GridBagConstraints.NORTHWEST;
		
		// Title
		constraints.gridx = column;
		constraints.gridy = row;
		constraints.gridwidth = 1;
		this.add(titleLabel, constraints);
		titleLabel.setBorder(new LineBorder(Color.RED)); // REMOVE LATER
		
		// Separator
		constraints.gridx = column;
		constraints.gridy = nextRow();
		constraints.gridwidth = itemColumns + 2;
		this.add(new JSeparator(), constraints);
		
		// Item List
		/*
		cartList = new JPanel();
		grid = new GridLayout(listItems.size(), itemColumns + 2, 10, 5);
		cartList.setLayout(grid);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setLayout(new ScrollPaneLayout());
		scrollPane.add(cartList, constraints);
		scrollPane.setWheelScrollingEnabled(true);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		constraints.gridx = column;
		constraints.gridy = nextRow();
		constraints.gridwidth = 3;
		constraints.weightx = 2;
		this.add(scrollPane, constraints);
		cartList.setBorder(new LineBorder(Color.RED)); // REMOVE LATER
		scrollPane.setBorder(new LineBorder(Color.RED)); // REMOVE LATER
		constraints.weightx = 1;
		*/
		
		constraints.gridx = column;
		constraints.gridy = nextRow();
		constraints.gridwidth = 3;
		constraints.weighty = 1;

//		JScrollPane scrollPane = new JScrollPane();
//		cartList = new JPanel();
//		grid = new GridLayout(listItems.size(), itemColumns + 2, 10, 5);
//		cartList.setLayout(grid);
//		scrollPane.add(cartList, constraints);
//
//		scrollPane.setWheelScrollingEnabled(true);
//		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//
//		scrollPane.add(cartList, constraints);
//		cartList.setBorder(new LineBorder(Color.RED)); // REMOVE LATER
//		scrollPane.setBorder(new LineBorder(Color.RED)); // REMOVE LATER
//		this.add(scrollPane, constraints);
//
//		cartList.setSize(400, 400);
//		System.out.println("Viewport: " + scrollPane.getViewport());
		
		cartList = new JPanel();
		grid = new GridLayout(listItems.size(), itemColumns + 2, 10, 5);
		cartList.setLayout(grid);
		JScrollPane scrollPane = new JScrollPane(cartList);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		ScrollPaneLayout layout = new ScrollPaneLayout();
		scrollPane.setLayout(layout);
		constraints.fill = constraints.BOTH;
		constraints.weighty = 1;
		this.add(scrollPane, constraints);
		cartList.setBorder(new LineBorder(Color.RED)); // REMOVE LATER
		scrollPane.setBorder(new LineBorder(Color.RED)); // REMOVE LATER
		
		constraints.fill = constraints.HORIZONTAL;
		constraints.weighty = 1;
		
		// Add new Item button
		constraints.gridx = 0;
		constraints.gridy = nextRow();
		constraints.gridwidth = itemColumns + 2;
		addItemButton = new JButton("+");
		this.add(addItemButton, constraints);
		addItemButton.setBorder(new LineBorder(Color.RED)); // REMOVE LATER
		
		// Separator
		constraints.gridx = column;
		constraints.gridy = nextRow();
		constraints.gridwidth = itemColumns + 2;
		this.add(new JSeparator(), constraints);
		
		// Total
		constraints.gridx = 0;
		constraints.gridy = nextRow();
		constraints.gridwidth = 1;
		JLabel totalLabel = new JLabel("Total");
		this.add(totalLabel, constraints);
		totalLabel.setBorder(new LineBorder(Color.RED)); // REMOVE LATER
		
		// Total amount
		constraints.gridx = nextColumn();
		constraints.gridy = row;
		constraints.gridwidth = 1;
		totalAmountLabel = new JLabel(Character.toString(currencySymbol) + " 0.00");
		this.add(totalAmountLabel, constraints);
		totalAmountLabel.setBorder(new LineBorder(Color.RED)); // REMOVE LATER
	}
	
	private int nextRow()
	{
		column = 0;
		return ++row;
	}
	
	private int nextColumn()
	{
		return ++column;
	}
	
	public void addItem(double cost, String... columns)
	{
		listItems.add(columns);
		itemCosts.add(cost);
	}
	
	public void setAddItemActionListener(ActionListener listener)
	{
		addItemButton.addActionListener(listener);
	}
	
	public void clear()
	{
		listItems.clear();
		itemCosts.clear();
		cartList.removeAll();
	}
	
	public void updateSelf()
	{
		cartList.removeAll();
		JLabel temp;
		JButton button;
		constraints.gridwidth = 1;
		for (int i = 0; i < listItems.size(); i++)
		{
			for (int j = 0; j < listItems.get(i).length; j++)
			{
				temp = new JLabel(listItems.get(i)[j]);
				cartList.add(temp);
			}
			cartList.add(new JLabel(Character.toString(currencySymbol) + " " + String.format("%.2f", itemCosts.get(i))), constraints);
			button = new JButton("-");
			final int _i = i;
			button.addActionListener(event ->
			{
				listItems.remove(_i);
				itemCosts.remove(_i);
				updateSelf();
			});
			cartList.add(button, constraints);
		}
		constraints.gridwidth = 1;
		
		totalAmount = 0;
		for (int i = 0; i < itemCosts.size(); i++)
			totalAmount += itemCosts.get(i);
		totalAmountLabel.setText(Character.toString(currencySymbol) + " " + String.format("%.2f", totalAmount));
	}
	
	
	/**
	 *  The panel needs to be extensible
	 *  The list needs to be able to expand and contract dynamically
	 *
	 *  There need to be buttons on the sides
	 *
	 *
	 */
	
	
}
