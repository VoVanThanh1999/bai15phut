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
import com.example.service.BacSiService;

@RestController
@RequestMapping(value = "/api")
public class BacSiApiController {

	@Autowired
	BacSiService bacSiService;

	@RequestMapping(value = "/getAll")
	public List<BacSi> getAll() {
		return bacSiService.getAll();
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public boolean delete(@PathVariable("id") int id) {
		bacSiService.delete(id);
		return true;
	}

	@PostMapping(value = "/add")
	public String add(@RequestBody BacSi bacSi) {
		System.err.println(bacSi.getMaBacSi());
		 bacSiService.save(bacSi); 
		return "them thanh cong";
	}
	
	@PutMapping(value = "/edit")
	public String edit(@RequestBody BacSi bacSi) {
		System.err.println(bacSi.getMaBacSi());
		 bacSiService.edit(bacSi); 
		return " sua thanh cong";
	}
}
