package englishVersion;

import java.util.Comparator;

public class EnglishCustomer implements Comparable<EnglishCustomer>{

	int age;
	int out; // �з� ����
	String gender;
	String location;
	String id;
	
	EnglishCustomer(){ //this(0, null, null, null);
		
	}
	
	EnglishCustomer(int age, String id, String gender, String location, int out){
		this.age = age;
		this.gender = gender;
		this.location = location;
		this.out = out;
		this.id = id;
	}
	
	public String toString () { 
		return 
		    "�� ��ID�� " + id + " ��Online use Time�� "+ out + " ��Age�� " + age  
		+ "\n  ��Genger�� "+ gender + " ��Location�� "+ location;
	}
	
	@Override
	public int compareTo(EnglishCustomer c) {
		// TODO Auto-generated method stub
		if (out > c.out) return -1; 
		else if (this.out == c.out) return id.compareTo(c.id);
		else return 1;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int out) {
		this.out = out;
	}



	

	


}
