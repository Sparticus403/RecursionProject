package recursion.view;

import javax.swing.*;
import recursion.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibButton;
	private JButton factButton;
	private JTextArea recursionText;
	private JTextField recursionField;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.fibButton = new JButton();
		this.factButton = new JButton();
		this.recursionText = new JTextArea();
		this.recursionField = new JTextField();
		
		setupPanel();
		setupLayout();
		setupListeners();		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
}
