package recursion.view;

import javax.swing.*;
import recursion.controller.RecursionController;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibButton;
	private JButton factButton;
	private JTextArea displayArea;
	private JTextField inputField;
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.fibButton = new JButton("Calculate Fibonacci Sequence");
		this.factButton = new JButton("Calculate the Factorial!");
		this.displayArea = new JTextArea(5, 25);
		this.inputField = new JTextField(15);
		
		setupPanel();
		setupLayout();
		setupListeners();		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		setPreferredSize(new Dimension(900,600));
		this.add(factButton);
		this.add(fibButton);
		this.add(inputField);
		this.add(displayArea);
		displayArea.setWrapStyleWord(true);
	}
	
	private void setupLayout()
	{

		baseLayout.putConstraint(SpringLayout.EAST, fibButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 0, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.WEST, factButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, factButton, -59, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 223, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, displayArea, -298, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 39, SpringLayout.SOUTH, displayArea);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -342, SpringLayout.EAST, this);
		
	}
	
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				displayArea.setText(baseController.transferFactorial(inputField.getText()));
			}
		});
		
		fibButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				displayArea.setText(baseController.transferFibonacci(inputField.getText()));
			}
				});
	}
}
