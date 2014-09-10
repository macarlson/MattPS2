package MainPackage;

public class MyInteger {
	private int value;
	
	public MyInteger (int value)
	{
		this.value = value;
	}
	
	public int GetValue()
	{
		return this.value;
	}
	
	public boolean IsEven()
	{
		return (this.value % 2 == 0);
	}
	
	public boolean IsOdd()
	{
		return (this.value % 2 != 0);
	}
	
	public boolean IsPrime()
	{
	}
	
	public static boolean IsEven(int value)
	{
		return (value % 2 == 0);
	}
	
	public static boolean IsOdd(int value)
	{
		return (value % 2 != 0);
	}
	
	public static boolean IsPrime(int value)
	{
	}
	
	public static boolean IsEven(MyInterger MyInt)
	{
		return (MyInt.value % 2 == 0);
	}
	
	public static boolean IsOdd(MyInterger MyInt)
	{
		return (MyInt.value % 2 != 0);
	}
	
	public static boolean IsPrime(MyInterger Myint)
	{
	}
	
	
	private static boolean CheckPrime(int value)
	{
		if (value <= 3 && value > 1)
		{
			return true;
		}
		if (value % 2 == 0 && value % 3 == 0)
		{
			return false;
		}
		for (int i = 5; i < Math.sqrt(value) + 1; i += 6)
		{
			if (value % i == 0 && value % (i+2) == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int)
	{
	}
	
	public boolean equals(MyInteger)
	{
	}
	
	public static int parseInt(char[])
	{
	}
	
	public static int parseInt(String)
	{
	}
}
