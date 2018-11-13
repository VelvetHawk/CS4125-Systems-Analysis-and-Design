package display.components;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class StaticChoicePanel<T> extends JPanel
{
	ArrayList<T> choices;
	
	// Util
	private int row;
	private int column;
	
	// Components
	private JLabel titleLabel;
	private GridBagConstraints constraints;
	
	public StaticChoicePanel()
	{
		this("No title text set");
	}
	
	public StaticChoicePanel(String title)
	{
		super();
		choices = new ArrayList<>();
		column = 0;
		row = 0;
		
		// Build GUI
		setLayout(new GridBagLayout());
		constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		// Defaults
		constraints.gridwidth = 1;
		constraints.weighty = 1;
		//constraints.weightx = 0.5;
		constraints.anchor = GridBagConstraints.NORTHWEST;
		
		// Title
		titleLabel = new JLabel(title);
		constraints.gridx = column;
		constraints.gridy = row;
		this.add(titleLabel, constraints);
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
	
	public void addChoice(T choice)
	{
	
	}
	
	public T getChoice(int position)
	{
		return choices.get(position);
	}
}
