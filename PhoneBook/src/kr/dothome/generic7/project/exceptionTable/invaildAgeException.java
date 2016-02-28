package kr.dothome.generic7.project.exceptionTable;

public class invaildAgeException extends Exception
{
	int wrongAge = 0;
	public invaildAgeException(int age)
	{
		super("The age you just wrote is wrong.");
		wrongAge = age;
	}
	
	public void showWrongAge()
	{
		System.out.println("Wrong age : " + wrongAge);
	}
}
