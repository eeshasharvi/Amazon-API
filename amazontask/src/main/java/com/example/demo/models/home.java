package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity

public class home {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String url;
	
	private String title;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public home() {
		super();
		// TODO Auto-generated constructor stub
	}

	public home(int id, String url, String title) {
		super();
		this.id = id;
		this.url = url;
		this.title = title;
	}
	
}
