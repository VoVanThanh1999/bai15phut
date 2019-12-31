package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.BaoVe;
import com.example.repository.BaoVeRepostiroy;;

@Service
public class BaoVeService {
	@Autowired
	BaoVeRepostiroy baoVeRepostiroy;
	 
	public List<BaoVe> getAll(){
		return baoVeRepostiroy.findAll();
	}
	
	public void add(BaoVe baoVe) {
		baoVeRepostiroy.save(baoVe);
	}
	
	public void xoaBaoVe(int id) {
		baoVeRepostiroy.deleteById(id);
	}
	
	public <S> void edit(BaoVe baoVe) {
		Optional<BaoVe> baoVe2 = baoVeRepostiroy.findById(baoVe.getMaBaoVe());
		baoVe2.get().setDiaChi(baoVe.getDiaChi());
		baoVe2.get().setEmail(baoVe.getEmail());
		baoVe2.get().setLuong(baoVe.getLuong());
		baoVe2.get().setMaBaoVe(baoVe.getMaBaoVe());
		baoVe2.get().setPhone(baoVe.getPhone());
		baoVe2.get().setTenBaoVe(baoVe.getTenBaoVe());
		baoVe2.get().setTuoiBaoVe(baoVe.getTuoiBaoVe());
		
		baoVeRepostiroy.save(baoVe2.get());
	}
}
