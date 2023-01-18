package com.huseyinaydin;

import java.io.Serializable;
import java.util.Objects;

public class Araba implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String brand;
	private Motor motor;
	public Araba() {
		super();
	}

	public Araba(Integer id, String brand, Motor motor) {
		super();
		this.id = id;
		this.brand = brand;
		this.motor = motor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, id);
	}

	@Override
	public boolean equals(Object obj) {
		return this.getId().equals(((Araba) obj).getId());
	}

	@Override
	public String toString() {
		return "Araba [id=" + id + ", brand=" + brand + ", motor= " + motor.toString() +"]";
	}
	
}
