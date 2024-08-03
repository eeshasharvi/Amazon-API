package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String cardholdersname;
	
	private long cardnumber;
	
	private int cvv;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardholdersname() {
		return cardholdersname;
	}

	public void setCardholdersname(String cardholdersname) {
		this.cardholdersname = cardholdersname;
	}

	public long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public payment(int id, String cardholdersname, long cardnumber, int cvv) {
		super();
		this.id = id;
		this.cardholdersname = cardholdersname;
		this.cardnumber = cardnumber;
		this.cvv = cvv;
	}
	
}
