package kr.dothome.generic7.project.PhoneBookManager;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import kr.dothome.generic7.project.PhoneBookData.PhoneBookPersonData;

public class PhoneBookManager
{
	HashSet<PhoneBookPersonData> dataStorage = new HashSet<PhoneBookPersonData>();
	public static Scanner input = new Scanner(System.in);
	
	public void deleteInfo()
	{
		System.out.println("Please enter the phone number which the person has.");
		System.out.println("Be careful. this procedure cannot be undone.");
		PhoneBookPersonData person = search(input.nextLine());
		
		if(person == null)
			System.out.println("Sorry. but that data is not exist.");
		else {
			dataStorage.remove(person);
			System.out.println("Data has removed successfully.");
		}
	}
	
	public void modifyInfo()
	{
		System.out.println("Please enter the phone number which the person has.");
		PhoneBookPersonData person = search(input.nextLine());
		showData(person);
		
		System.out.println("Which data do you want to modify?");
		// code goes here
	}
	
	public void inputInfo()
	{
		PhoneBookPersonData input;
		input = readPersonInfo();
		boolean isAdded = dataStorage.add(input);
		
		if(isAdded == true)
			System.out.println("Data has stored successfully.");
		else
			System.out.println("Data already exists. please try again.");
	}
	
	public void searchInfo()
	{
		System.out.println("Please enter the phone number which the person has.");
		PhoneBookPersonData person = search(input.nextLine());
		showData(person);
	}
	
	public PhoneBookPersonData readPersonInfo()
	{
		System.out.println("Please write the person's age.");
		int age = input.nextInt();
		System.out.println("Please write the person's full name.");
		String name = input.nextLine();
		System.out.println("Please write the person's phone number.");
		String phoneNum = input.nextLine();
		System.out.println("Please write the person's gender. be careful not to make typographical error.");
		String gender = input.nextLine();
		
		return new PhoneBookPersonData(age, name, phoneNum, gender);
	}
	
	private PhoneBookPersonData search(String phoneNum)
	{
		Iterator<PhoneBookPersonData> itr = dataStorage.iterator();
		while(itr.hasNext()) {
			PhoneBookPersonData str = itr.next();
			if(phoneNum.compareTo(str.getPhoneNum())==0)
				return str;
		}
		return null;
	}
	
	private void showData(PhoneBookPersonData obj)
	{
		if(obj == null)
			System.out.println("Oops. that data is not exist.");
		else {
			System.out.println("Data found!");
			obj.showData();
		}
	}
	
	public static PhoneBookManager getInst() {
		return new PhoneBookManager();
	}
}
