package com.se.onthick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.se.onthick.model.Lop;

@Service
public class LopServiceImpl implements LopService{
	
	private RestTemplate rest;
	private String url;
	
	
	@Autowired
	public LopServiceImpl(RestTemplate rest) {
		super();
		this.rest = rest;
		this.url = "http://localhost:8080/on-ck-rest-server/api/lop";
	}



	@Override
	public List<Lop> getLop() {
		// TODO Auto-generated method stub
		ResponseEntity<List<Lop>> res=rest.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Lop>>() {});		
		return res.getBody();
	}

}
