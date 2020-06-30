package com.uk.maping;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity  
@DiscriminatorValue("Batsman")  
 
public class Batsman extends TeamIndia {
	@Column(name = "Bating_hand")  
private String batingHand;
	@Column(name = "Highest_Score")  
private int highestScore;
public String getBatingHand() {
	return batingHand;
}
public void setBatingHand(String batingHand) {
	this.batingHand = batingHand;
}
public int getHighestScore() {
	return highestScore;
}
public void setHighestScore(int highestScore) {
	this.highestScore = highestScore;
}

}
