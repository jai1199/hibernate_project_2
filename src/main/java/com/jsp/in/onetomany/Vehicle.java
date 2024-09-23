package com.jsp.in.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id
private int vId;
private String vName;
private int price;
@ManyToOne
private Person person;

public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}
public int getvId() {
	return vId;
}
public void setvId(int vId) {
	this.vId = vId;
}
public String getvName() {
	return vName;
}
public void setvName(String vName) {
	this.vName = vName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Vehicle [vId=" + vId + ", vName=" + vName + ", price=" + price + ", person=" + person + "]";
}

}
