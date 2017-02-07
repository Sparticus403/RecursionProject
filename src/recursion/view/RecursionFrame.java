package recursion.view;

import javax.swing.*;
import recursion.controller.RecursionController;

public class RecursionFrame extends JFrame
{
	
	private RecursionPanel basePanel;
	private RecursionController baseController;
	
	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.basePanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
	}
}
