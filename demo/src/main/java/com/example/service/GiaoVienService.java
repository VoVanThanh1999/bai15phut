package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.GiaoVien;
import com.example.repository.GiaoVienRepository;

@Service
public class GiaoVienService {
	@Autowired
	GiaoVienRepository giaovienrepository;
	

	 
	public List<GiaoVien> getTacCaGiaoVien(){
		return giaovienrepository.findAll();
	}
	

	public void delete(int id) {
		giaovienrepository.deleteById(id);
	}
	
	public void save(GiaoVien giaoVienQuang) {
		GiaoVien giaoVien = new GiaoVien();
		giaoVien.setDiaChi(giaoVienQuang.getDiaChi());
		giaoVien.setEmail(giaoVienQuang.getEmail());
		giaoVien.setLuong(giaoVienQuang.getLuong());
		giaoVien.setMaGiaoVien(giaoVienQuang.getMaGiaoVien());
		giaoVien.setPhone(giaoVienQuang.getPhone());
		giaoVien.setTenGiaoVien(giaoVienQuang.getTenGiaoVien());
		giaoVien.setTuoiGiaoVien(giaoVienQuang.getTuoiGiaoVien());
		giaovienrepository.save(giaoVien);

	}
	public void edit(GiaoVien giaoVienQuang) {
		Optional<GiaoVien> optional = giaovienrepository.findById(giaoVienQuang.getMaGiaoVien());
		if (optional.get() != null) {
			optional.get().setDiaChi(giaoVienQuang.getDiaChi());
			optional.get().setEmail(giaoVienQuang.getEmail());
			optional.get().setLuong(giaoVienQuang.getLuong());
			optional.get().setMaGiaoVien(giaoVienQuang.getMaGiaoVien());
			optional.get().setPhone(giaoVienQuang.getPhone());
			optional.get().setTenGiaoVien(giaoVienQuang.getTenGiaoVien());
			optional.get().setTuoiGiaoVien(giaoVienQuang.getTuoiGiaoVien());
			giaovienrepository.save(optional.get());
		}

	 
}
}