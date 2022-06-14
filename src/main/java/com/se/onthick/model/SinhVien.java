package com.se.onthick.model;


public class SinhVien {
	private int id;
	
	private String hoTen;
	
	private String email;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public SinhVien(int id, String hoTen, String email) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.email = email;
	}

	public SinhVien() {
		super();
	}
	
	
}
