package com.example.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.BacSi;
import com.example.model.BaoVe;
import com.example.service.BacSiService;
import com.example.service.BaoVeService;

@RestController 
@RequestMapping(value = "/api")
public class BaoVeApiController {

	@Autowired
	BaoVeService baoVeService;

	@RequestMapping(value = "/getAll")
	public List<BaoVe> getAll() {
		return baoVeService.hienThiTatCa();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public boolean delete(@PathVariable("id") int id) {
		baoVeService.xoaBaoVe(id);
		return true;
	}

	@PostMapping(value = "/add")
	public String add(@RequestBody BaoVe baoVe) {
		System.err.println(baoVe.getMaBaoVe());
		baoVeService.themBaoVe(baoVe);
		return "them thanh cong";
	}
	
	@PutMapping(value = "/edit")
	public String edit(@RequestBody BaoVe baoVe) {
		
		baoVeService.suaBaoVe(baoVe); 
		return " sua thanh cong";
	}
}
