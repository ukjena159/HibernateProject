package com.uk.maping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity  
@Table(name = "Team_India")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn(name="catagory",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="TeamIndia")  
public class TeamIndia {
	@Id  
	@GeneratedValue(strategy=GenerationType.AUTO)      
	@Column(name = "sl_no")  
	private int  id;
	@Column(name = "First_Name")  
	private String firstName;
	@Column(name = "Last_name")  
	private String lastName;
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
	

}
