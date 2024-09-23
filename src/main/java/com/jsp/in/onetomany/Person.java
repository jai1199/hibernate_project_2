package com.jsp.in.onetomany;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Person {
	@Id
private int pId;
private String pName;
private long pContact;


@OneToMany(mappedBy = "person")
List<Vehicle> vlist=new ArrayList<Vehicle>();
public List<Vehicle> getVlist() {
	return vlist;
}
public void setVlist(List<Vehicle> vlist) {
	this.vlist = vlist;
}

public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public long getpContact() {
	return pContact;
}
public void setpContact(long pContact) {
	this.pContact = pContact;
}
@Override
public String toString() {
	return "Person [pId=" + pId + ", pName=" + pName + ", pContact=" + pContact + ", vlist=" + vlist + "]";
}

}
