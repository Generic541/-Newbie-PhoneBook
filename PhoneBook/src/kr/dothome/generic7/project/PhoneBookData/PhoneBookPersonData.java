package kr.dothome.generic7.project.PhoneBookData;

public class PhoneBookPersonData
{
	private int age;						// a person's age
	private String name;					// a person's name
	private String phoneNum;				// a person's phone number
	private String gender;					// a person's gender
	
	public PhoneBookPersonData(int age, String name, String phoneNum)
	{
		this.age = age;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	public PhoneBookPersonData(int age, String name, String phoneNum, String gender)
	{
		this.age = age;
		this.name = name;
		this.phoneNum = phoneNum;
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void showData() {
		System.out.println("Name : " + getName());
		System.out.println("Phone Number :" + getPhoneNum());
		System.out.println("Gender : " + getGender());
		System.out.println("Age : " + getAge());
	}
	
	@Override
	public int hashCode() {
		return phoneNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		PhoneBookPersonData comp = (PhoneBookPersonData)obj;
		if(phoneNum.compareTo(comp.phoneNum)==0)
			return true;
		else return false;
	}
}
