package com.demo.hierarchy;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class RegularEmployee extends Employee {
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Column(name="salary")    
	private float salary;  
	  
	@Column(name="bonus")     
	private int bonus;  
}
