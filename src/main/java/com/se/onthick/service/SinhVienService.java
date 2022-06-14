package com.se.onthick.service;

import java.util.List;

import com.se.onthick.model.SinhVien;


public interface SinhVienService {
	
	public void addSinhVien(SinhVien sv, int id);
	public List<SinhVien> getSVByLop(String malop);
	public SinhVien getSVById(int id);
	public void deleteSV(int id);


}
