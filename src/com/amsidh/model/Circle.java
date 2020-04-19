package com.amsidh.model;

public class Circle {
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Circle(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
