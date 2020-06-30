package com.uk.maping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bowlingHand")
public class Bowler extends TeamIndia {
	@Column(name = "boling_hand")
	private String bowlingHand;
	@Column(name = "wickect")
	private int wickect;

	public String getBowlingHand() {
		return bowlingHand;
	}

	public void setBowlingHand(String bowlingHand) {
		this.bowlingHand = bowlingHand;
	}

	public int getWickect() {
		return wickect;
	}

	public void setWickect(int wickect) {
		this.wickect = wickect;
	}

}
