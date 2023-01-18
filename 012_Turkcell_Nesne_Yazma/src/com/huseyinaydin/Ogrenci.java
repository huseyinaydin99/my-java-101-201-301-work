package com.huseyinaydin;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Ogrenci implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	public Ogrenci() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ogrenci(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		return this.getId() == ((Ogrenci) obj).getId();
	}
	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", name=" + name + "]";
	}
}
