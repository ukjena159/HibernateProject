package com.uk.demoHibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	@Column(name = "student_name")
	private String sname;
	@Column(name = "student_address")
	private String address;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAdress() {
		return address;
	}

	public void setAdress(String adress) {
		this.address = adress;
	}

}
