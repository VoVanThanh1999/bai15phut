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
	

	
	public void delete(int id) {
		bacSiRepository.deleteById(id);
	}
	
	public void save(BacSi bacSiDto) {
		BacSi bacSi = new BacSi();
		bacSi.setDiaChi(bacSiDto.getDiaChi());
		bacSi.setEmail(bacSiDto.getEmail());
		bacSi.setLuong(bacSiDto.getLuong());
		bacSi.setMaBacSi(bacSiDto.getMaBacSi());
		bacSi.setPhone(bacSiDto.getPhone());
		bacSi.setTenBacSi(bacSiDto.getTenBacSi());
		bacSi.setTuoiBacSi(bacSiDto.getTuoiBacSi());
		bacSiRepository.save(bacSi);

	}
	public void edit(BacSi bacSiDto) {
		Optional<BacSi> optional = bacSiRepository.findById(bacSiDto.getMaBacSi());
		if (optional.get() != null) {
			optional.get().setDiaChi(bacSiDto.getDiaChi());
			optional.get().setEmail(bacSiDto.getEmail());
			optional.get().setLuong(bacSiDto.getLuong());
			optional.get().setMaBacSi(bacSiDto.getMaBacSi());
			optional.get().setPhone(bacSiDto.getPhone());
			optional.get().setTenBacSi(bacSiDto.getTenBacSi());
			optional.get().setTuoiBacSi(bacSiDto.getTuoiBacSi());
			bacSiRepository.save(optional.get());
		}
	}
}
