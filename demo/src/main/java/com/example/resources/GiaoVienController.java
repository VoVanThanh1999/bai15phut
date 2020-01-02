package com.example.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.GiaoVien;
import com.example.service.GiaoVienService;

public class GiaoVienController {
	@Autowired
	GiaoVienService giaoVienService;

	@RequestMapping(value = "/getAll")
	public List<GiaoVien> getAll() {
		return giaoVienService.getTacCaGiaoVien();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public boolean delete(@PathVariable("id") int id) {
		giaoVienService.delete(id);
		return true;
	}

	@PostMapping(value = "/add")
	public String add(@RequestBody GiaoVien giaoVien) {
		System.err.println(giaoVien.getMaGiaoVien());
		giaoVienService.save(giaoVien); 
		return "Quang Beo da them thanh cong";
	}
	
	@PutMapping(value = "/edit")
	public String edit(@RequestBody GiaoVien giaoVien) {
		System.err.println(giaoVien.getMaGiaoVien());
		giaoVienService.edit(giaoVien); 
		return "Quang Beo da sua thanh cong";
	}
}
