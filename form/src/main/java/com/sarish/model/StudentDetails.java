package com.sarish.model;

public class StudentDetails {

	private int id;
	private String name;
	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public StudentDetails(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public StudentDetails() {
		super();
	}
	public StudentDetails(int id) {
		super();
		this.id=id;
	}
	@Override
	public String toString() {
		return "StuddentDetails [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}