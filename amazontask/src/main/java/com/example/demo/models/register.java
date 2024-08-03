package com.example.demo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class register {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Email
	private String email;
	
	@Size(min = 6, max = 20)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public register() {
		super();
		// TODO Auto-generated constructor stub
	}

	public register(int id, @Email String email, @Size(min = 6, max = 20) String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	
}
