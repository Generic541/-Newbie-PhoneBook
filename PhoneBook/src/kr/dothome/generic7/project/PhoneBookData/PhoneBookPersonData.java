package kr.dothome.generic7.project.PhoneBookData;

public abstract class PhoneBookPersonData
{
	private int age;				// a person's age
	private String name;				// a person's name
	private int phoneNum;				// a person's phone number
	private boolean genderidentifier;		// 'true' means "male", 'false' means "female"
	
	public PhoneBookPersonData(int age, String name, int phoneNum)
	{
		this.age = age;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	public PhoneBookPersonData(int age, String name, int phoneNum, boolean gender)
	{
		this.age = age;
		this.name = name;
		this.phoneNum = phoneNum;
		this.genderidentifier = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	public boolean getGender() {
		return genderidentifier;
	}
}
