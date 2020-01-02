package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.BacSi;
import com.example.repository.BacSiRepository;

@Service
public class NguoiMauService {
	@Autowired
	NguoiMauRepository nguoimauRepository;
	 
	public List<BacSi> getAll(){
		return guoimauRepository.findAll();
	}
	
	public void add(BacSi bacSi) {
		nguoimauRepository.save(bacSi);
	}
	
	public void delete(int id) {
		nguoimauRepository.deleteById(id);
	}
	
	public void edit(BacSi nguoimau) {
		Optional<BacSi> bacSi2 = nguoimauRepository.findById(nguoimau.getMaBacSi());
		bacSi2.get().setDiaChi(nguoimau.getDiaChi());
		bacSi2.get().setEmail(nguoimau.getEmail());
		bacSi2.get().setLuong(nguoimau.getLuong());
		bacSi2.get().setMaBacSi(nguoimau.getMaBacSi());
		bacSi2.get().setPhone(nguoimau.getPhone());
		bacSi2.get().setTenBacSi(nguoimau.getTenBacSi());
		bacSi2.get().setTuoiBacSi(nguoimau.getTuoiBacSi());
		
		nguoimauRepository.save(bacSi2.get());
	}
}
