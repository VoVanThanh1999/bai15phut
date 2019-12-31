package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.BacSi;
import com.example.repository.BacSiRepository;

@Service
public class BacSiService {
	@Autowired
	BacSiRepository bacSiRepository;
	 
	public List<BacSi> getAll(){
		return bacSiRepository.findAll();
	}
	
	public void add(BacSi bacSi) {
		bacSiRepository.save(bacSi);
	}
	
	public void delete(int id) {
		bacSiRepository.deleteById(id);
	}
	
	public void edit(BacSi bacSi) {
		Optional<BacSi> bacSi2 = bacSiRepository.findById(bacSi.getMaBacSi());
		bacSi2.get().setDiaChi(bacSi.getDiaChi());
		bacSi2.get().setEmail(bacSi.getEmail());
		bacSi2.get().setLuong(bacSi.getLuong());
		bacSi2.get().setMaBacSi(bacSi.getMaBacSi());
		bacSi2.get().setPhone(bacSi.getPhone());
		bacSi2.get().setTenBacSi(bacSi.getTenBacSi());
		bacSi2.get().setTuoiBacSi(bacSi.getTuoiBacSi());
		
		bacSiRepository.save(bacSi2.get());
	}
}
