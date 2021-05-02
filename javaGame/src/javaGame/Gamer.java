package javaGame;

public class Gamer {

	private int tcNo;
	private String name;
	private String lastName;
	private int yearOfBirth;
	
	public Gamer() {
		
	}
  

	public Gamer(int tcNo, String name, String lastName, int yearOfBirth) {
		this.tcNo = tcNo;
		this.name = name;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}

	public int getTcNo() {
		return tcNo;
	}

	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
