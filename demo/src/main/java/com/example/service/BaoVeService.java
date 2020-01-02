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
	 
	public List<BaoVe> hienThiTatCa(){
		return baoVeRepostiroy.findAll();
	}

	
	public void xoaBaoVe(int id) {
		baoVeRepostiroy.deleteById(id);
	}
	
	public void themBaoVe(BaoVe baoVeOtm) {
		BaoVe baoVe = new BaoVe();
		baoVe.setDiaChi(baoVeOtm.getDiaChi());
		baoVe.setEmail(baoVeOtm.getEmail());
		baoVe.setLuong(baoVeOtm.getLuong());
		baoVe.setMaBaoVe(baoVeOtm.getMaBaoVe());
		baoVe.setPhone(baoVeOtm.getPhone());
		baoVe.setTenBaoVe(baoVeOtm.getTenBaoVe());
		baoVe.setTuoiBaoVe(baoVeOtm.getTuoiBaoVe());
		baoVeRepostiroy.save(baoVe);

	}
	public void suaBaoVe(BaoVe baoVeOtm) {
		Optional<BaoVe> optional =baoVeRepostiroy.findById(baoVeOtm.getMaBaoVe());
		if (optional.get() != null) {
			optional.get().setDiaChi(baoVeOtm.getDiaChi());
			optional.get().setEmail(baoVeOtm.getEmail());
			optional.get().setLuong(baoVeOtm.getLuong());
			optional.get().setMaBaoVe(baoVeOtm.getMaBaoVe());
			optional.get().setPhone(baoVeOtm.getPhone());
			optional.get().setTenBaoVe(baoVeOtm.getTenBaoVe());
			optional.get().setTuoiBaoVe(baoVeOtm.getTuoiBaoVe());
			baoVeRepostiroy.save(optional.get());
		}
	}

	
}

