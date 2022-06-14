package com.se.onthick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.se.onthick.model.SinhVien;
import com.se.onthick.service.SinhVienService;


@Controller
@RequestMapping("sinhvien")
public class SinhVienController {
	
	
	@Autowired
	private SinhVienService svService;
	
	@GetMapping("/list")
	public String listCustomers(Model theModel, @RequestParam("customerId") String theId) {
		
		List<SinhVien> svs = svService.getSVByLop(theId);
				
		theModel.addAttribute("customers", svs);
		theModel.addAttribute("malop", theId);
		return "list-sinhvien";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel,@RequestParam("malop") int malop) {
		
		SinhVien theCustomer = new SinhVien();
		
		theModel.addAttribute("customer", theCustomer);
		theModel.addAttribute("malop", malop);
		return "sinhvien-form";
	}
	
	@PostMapping("/saveSinhVien")
	public String saveSinhVien(@ModelAttribute("customer") SinhVien sv,@RequestParam("malop") int malop) {
		
		svService.addSinhVien(sv,malop);	
		
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("customerId") int theId,
									Model theModel,@RequestParam("malop") int malop) {
		
		SinhVien theCustomer = svService.getSVById(theId);
		theModel.addAttribute("malop", malop);
		theModel.addAttribute("customer", theCustomer);
		return "sinhvien-form";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int theId) {
		
		svService.deleteSV(theId);
		
		return "redirect:/";
	}

}
