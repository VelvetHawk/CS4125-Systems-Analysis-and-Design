package display.components;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class StaticChoicePane extends VBox
{
	// Data
	private ArrayList<Label> panelOptions;
	private ArrayList<Image> panelImages;
	
	// Components
	private HBox horizontalBox;
	
	public StaticChoicePane()
	{
		this("No title set", null, null);
	}
	
	public StaticChoicePane(String panelTitle, String[] options, String[] imagePaths)
	{
		super();
		
		// Components
		Label titleLabel = new Label(panelTitle);
		panelOptions = new ArrayList<>();
		panelImages = new ArrayList<>();
		
		// Horizontal scroll wrapper
		horizontalBox = new HBox();
		horizontalBox.setSpacing(10);
		
		// Choice text
		for (String option : options)
			panelOptions.add(new Label(option));

		// Choice images
		for (String imagePath : imagePaths)
			panelImages.add(new Image(imagePath));
		
		HBox choiceBox = new HBox();
		choiceBox.setSpacing(10);
		
		VBox optionPanel;
		for (int i = 0; i < options.length; i++)
		{
			optionPanel = new VBox();
			
			// Add image
			optionPanel.getChildren().add(new ImageView(panelImages.get(i)));
			// Add text
			optionPanel.getChildren().add(panelOptions.get(i));
			// Mouse click
			final int j = i;
			optionPanel.setOnMouseClicked(event ->
			{
				System.out.println("Selected: " + panelOptions.get(j).getText());
			});
			
			// Add to choices
			choiceBox.getChildren().add(optionPanel);
		}
		
		horizontalBox.getChildren().add(choiceBox);
		
		// Select
		Button selectButton = new Button("Select");
		selectButton.setOnAction(actionEvent ->
		{
			//for ()
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
