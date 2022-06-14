package com.se.onthick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.se.onthick.model.Lop;
import com.se.onthick.model.SinhVien;

@Service
public class SinhVienServiceImpl implements SinhVienService{
	
	private RestTemplate rest;
	private String url;
	
	
	@Autowired
	public SinhVienServiceImpl(RestTemplate rest) {
		super();
		this.rest = rest;
		this.url = "http://localhost:8080/on-ck-rest-server/api/sinhvien";
	}

	@Override
	public void addSinhVien(SinhVien sv, int id) {
		// TODO Auto-generated method stub
		int idsv= sv.getId();
		if(idsv == 0) {
			rest.postForEntity(url+"/"+id, sv, String.class);
		}else {
			rest.put(url+"/"+id, sv);
		}
	}

	@Override
	public List<SinhVien> getSVByLop(String malop) {
		ResponseEntity<List<SinhVien>> res=rest.exchange(url+"lop/"+malop, HttpMethod.GET, null, new ParameterizedTypeReference<List<SinhVien>>() {});		
		return res.getBody();
	}

	@Override
	public SinhVien getSVById(int id) {
		// TODO Auto-generated method stub
		return rest.getForObject(url+"/"+id, SinhVien.class);
	}

	@Override
	public void deleteSV(int id) {
		// TODO Auto-generated method stub
		rest.delete(url+"/"+id);
	}

}
