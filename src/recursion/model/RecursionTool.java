package recursion.model;

public class RecursionTool 
{
	
	public double calculateFactIterative(double currentNumber)
	{
		double answer = 0;
		if(currentNumber)
	}
	
	public int calcFibIter()
	{
		
	}
	
	public double calculateFactorial(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}

}
