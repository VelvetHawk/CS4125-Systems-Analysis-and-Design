package display.components;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class CartList extends VBox
{
	// Data
	private double totalAmount;
	private char currencySymbol;
	
	// Components
	private ScrollPane scrollPane;
	private GridPane itemPanel;
	private Label totalLabel;
	
	public CartList()
	{
		this("No title set", '\u20AC', 400, 500);
	}
	
	public CartList(String panelTitle, char currrencySymbol, int width, int height)
	{
		super();
		
		// Components
		Label titleLabel = new Label(panelTitle);
		this.currencySymbol = currrencySymbol;
		totalAmount = 0;
		
		itemPanel = new GridPane();
		itemPanel.setHgap(20); // Horizontal spacing
		//itemPanel.setVgap(1); // Vertical spacing
		
		scrollPane = new ScrollPane();
		scrollPane.setContent(itemPanel);
		scrollPane.setPrefSize(width, height);
		
		totalLabel = new Label(currrencySymbol + " 0.00");
		
		HBox totalPane = new HBox();
		totalPane.getChildren().addAll(
			new Label("Total"),  // "Total" text
			totalLabel
		);
		totalPane.setSpacing(10);
		
		Button addItemButton = new Button("+");
		String[] meep = {"AA", "BB"};
		addItemButton.setOnAction(actionEvent -> addRow(meep, 100));
		
		this.getChildren().addAll(
			titleLabel,     // Title
			scrollPane,      // Order Grid
			addItemButton,  // Add items button
			totalPane       // Total text + amount
		);
	}
	
//	public void add(String[] items, double itemCost, int rowIndex)
//	{
//		int columnIndex = 0;
//		totalAmount += itemCost;
//		for (int i = 0; i < items.length; i++, columnIndex++)
//			itemPanel.add(new Label(items[i]), columnIndex, rowIndex);
//		itemPanel.add(new Label(currencySymbol + " " + String.format("%.2f", itemCost)), columnIndex, rowIndex);
//		Button removeItem = new Button("-");
//		removeItem.setOnAction(actionEvent ->
//		{
//			totalAmount -= itemCost;
//			totalLabel.setText(currencySymbol + String.format("%.2f", totalAmount));
//			itemPanel.getChildren().removeIf(node -> GridPane.getRowIndex(node) == rowIndex);
//		});
//		// Add button
//		itemPanel.add(removeItem, ++columnIndex, rowIndex);
//		// Set total text
//		totalLabel.setText(currencySymbol + String.format("%.2f", totalAmount));
//	}
	
	public void addRow(String[] items, double itemCost)
	{
		totalAmount += itemCost;
		Node[] row = new Node[items.length + 2];
		int i = 0;
		for ( ; i < items.length; i++)
			row[i] = new Label(items[i] + (char)(int)(Math.random() * 100 + 60));
		row[i] = new Label(currencySymbol + " " + String.format("%.2f", itemCost));
		//int lastRowIndex = itemPanel.getRowCount()-1;
		Button removeItemButton = new Button("-");
		removeItemButton.setOnAction(actionEvent ->
		{
			totalAmount -= itemCost;
			totalLabel.setText(currencySymbol + String.format("%.2f", totalAmount));
			for (Node child : itemPanel.getChildren())
				if (child == (Button)actionEvent.getSource())
				{
					itemPanel.getChildren().removeIf(node -> GridPane.getRowIndex(node) == GridPane.getRowIndex(child));
					break;
				}
		});
		row[++i] = removeItemButton;
		//itemPanel.addRow(itemPanel.getRowCount()+1, row);
		// Set total text
		totalLabel.setText(currencySymbol + String.format("%.2f", totalAmount));
		
	}
}
