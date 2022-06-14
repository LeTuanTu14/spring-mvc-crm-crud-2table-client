package com.se.onthick.model;

import java.util.List;


public class Lop {
	
	private int id;
	
	private String tenLop;
	
	private List<SinhVien> dsSinhVien;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public Lop(int id, String tenLop) {
		super();
		this.id = id;
		this.tenLop = tenLop;
	}

	public Lop() {
		super();
	}

	public List<SinhVien> getDsSinhVien() {
		return dsSinhVien;
	}

	public void setDsSinhVien(List<SinhVien> dsSinhVien) {
		this.dsSinhVien = dsSinhVien;
	}
	
	

}
