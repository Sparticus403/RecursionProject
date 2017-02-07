package recursion.controller;

import javax.swing.JOptionPane;
import recursion.view.RecursionFrame;

import recursion.model.RecursionTool;
import recursion.model.Timer;

public class RecursionController 
{
	private RecursionFrame baseFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;
	
	public void start()
	{
		JOptionPane.showMessageDialog(baseFrame, "Woo");
	}
	
	public RecursionController()
	{
		this.baseFrame = new RecursionFrame(this);
		this.mathTool = new RecursionTool();
		this.mathTimer = new Timer();
	}
	
	public String transferFactorial(String value)
	{
		String factorialResponse = "The factorial of " + value + " is: ";
		mathTimer.startTimer();
		if(isValid(value))
		{
			factorialResponse += mathTool.calculateFactorial(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		factorialResponse += "\n" + mathTimer.toString();
		mathTimer.resetTimer();
		
		return factorialResponse;
	}
	
	public String transferFibonacci(String value)
	{
		String fibonacciResponse = "The Fibonacci sequence at " + value + " is:\n";
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(value))
		{
			fibonacciResponse += mathTool.calculateFibonacci(Integer.parseInt(value));
		}
		
		mathTimer.stopTimer();
		fibonacciResponse += "\n" + mathTimer.toString();
		
		return fibonacciResponse;
	}
	
	private boolean isValid(String current)
	{
		try
		{
			double test = Double.parseDouble(current);
			if(test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid integer");
			return false;
		}
	}

}
