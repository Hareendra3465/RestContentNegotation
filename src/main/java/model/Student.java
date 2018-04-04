package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
    private String Id;
	private String firstname;
	private String Lastname;
	private int age;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
