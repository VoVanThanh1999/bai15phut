package com.example.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<BacSi>getAll(){
		return bacSiService.getAll();
	}
	@RequestMapping(value = "/delete/{id}",method=RequestMethod.GET)
	public boolean delete(@PathVariable("id") int id) {
		bacSiService.delete(id);
		return true;
	}
	@RequestMapping(value = "/add")
	public boolean add(@RequestBody BacSi bacSi) {
		bacSiService.add(bacSi);
		return true;
	}
}
