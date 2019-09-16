package entity;

import java.util.Date;

public class Student {
	int id;
	String name;
	int year;
	String gender;
	Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Student( String name, int year, String gender, Date date) {
		super();
		this.name = name;
		this.year = year;
		this.gender = gender;
		this.date = date;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
}
