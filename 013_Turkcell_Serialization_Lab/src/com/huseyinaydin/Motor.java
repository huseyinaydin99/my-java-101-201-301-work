package com.huseyinaydin;

import java.io.Serializable;
import java.util.Objects;

public class Motor implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer hacim;

	public Motor() {
		super();
	}

	public Motor(Integer hacim) {
		super();
		this.hacim = hacim;
	}

	public Integer getHacim() {
		return hacim;
	}

	public void setHacim(Integer hacim) {
		this.hacim = hacim;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hacim);
	}

	@Override
	public boolean equals(Object obj) {
		return this.getHacim().equals(((Motor)obj).getHacim());
	}

	@Override
	public String toString() {
		return "Motor [hacim=" + hacim + "]";
	}
	
	
}
