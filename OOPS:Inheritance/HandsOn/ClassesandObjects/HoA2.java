class Calculator
{

	public static double powerInt(int num1, int num2)
	{
		return Math.pow(num1,num2);
	}

	public static double powerDouble(double num1, int num2)
	{
		return Math.pow(num1,num2);
	}
}


public class HoA2
{
	public static void main(String[] args)
	{
		Calculator calc = new Calculator();
		System.out.println("Result of powerInt : "+calc.powerInt(2,4));
		System.out.println("Result of powerDouble : "+calc.powerInt(4,2));
	}
}