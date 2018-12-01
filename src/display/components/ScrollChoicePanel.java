package display.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrollChoicePanel<T> extends VBox
{
	// Data
	private ArrayList<T> panelOptions;
	
	// Components
	private Button scrollLeft;
	private Button scrollRight;
	private HBox horizontalBox;
	
	public ScrollChoicePanel()
	{
		this("No title set", null);
	}
	
	public ScrollChoicePanel(String panelTitle, T[] options)
	{
		super();
		
		// Components
		Label titleLabel = new Label(panelTitle);
		panelOptions = new ArrayList<>();
		panelOptions.addAll(Arrays.asList(options));
		
		// Horizontal scroll wrapper
		horizontalBox = new HBox();
		horizontalBox.setSpacing(10);
		
		// Choices
		HBox choiceBox = new HBox();
		choiceBox.setSpacing(10);
		panelOptions.forEach(option ->
		{
			Label temp = new Label(option.toString());
			// Mouse click
			temp.setOnMouseClicked(event ->
			{
				System.out.println("Bleh");
			});
			choiceBox.getChildren().add(temp);
		});
		
		// Left scroll
		scrollLeft = new Button("<");
		scrollLeft.setOnAction(actionEvent ->
		{
		
		});
		
		// Right scroll
		scrollRight = new Button(">");
		scrollRight.setOnAction(actionEvent ->
		{
		
		});
		
		horizontalBox.getChildren().addAll(
				scrollLeft,
				choiceBox,
				scrollRight
		);
		
		// Select
		Button selectButton = new Button("Select");
		selectButton.setOnAction(actionEvent ->
		{
		
		});
		
		// Back
		Button backButton = new Button("Back");
		backButton.setOnAction(actionEvent ->
		{
		
		});
		
		// Navigation box
		HBox navigationBox = new HBox();
		navigationBox.getChildren().addAll(
				selectButton, backButton
		);
		
		this.getChildren().addAll(
				titleLabel,
				horizontalBox,
				navigationBox
		);
		
	}
}
