package kr.dothome.generic7.project.PhoneBookManager;

public class PhoneBookDisplayManager
{
	public static void InsertSpace(int count)
	{
		for(int i = 0; i < count; i++)
			System.out.println(" ");
	}
	
	public static void InsertTab(int count)
	{
		for(int i = 0; i < count; i++)
			System.out.println("\t");
	}
	
	public static void DrawLine(int count, char Pattern)
	{
		for(int i = 0; i < count; i++)
			System.out.print(Pattern);
	}
	
	public static void showMenu()
	{
		System.out.println("Input data : 1");
		System.out.println("Delete data : 2");
		System.out.println("Modify data : 3");
		System.out.println("Search data : 4");
		System.out.println("Exit : 5");
	}
}
