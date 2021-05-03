package entities;
import java.time.format.DateTimeFormatter;

import abstracts.Entity;

public class Customer implements Entity {

	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBrith;
	private long nationallityId;

	public Customer() {

		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String firstName, String lastName, int dateOfBrith, long nationallityId) {

		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBrith = dateOfBrith;
		this.nationallityId = nationallityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBrith() {
		return dateOfBrith;
	}

	public void setDateOfBrith(int dateOfBrith) {
		this.dateOfBrith = dateOfBrith;
	}

	public long getNationallityId() {
		return nationallityId;
	}

	public void setNationallityId(long nationallityId) {
		this.nationallityId = nationallityId;
	}

}
