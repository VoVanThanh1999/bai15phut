package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.GiaoVien;

@Repository
public interface GiaoVienRepository extends JpaRepository<GiaoVien, Integer> {
	
	@Query(value="SELECT u FROM u where u.tenGiaoVien = : tenGiaoVien and u.diaChi = :diaChi",nativeQuery=true)
	public GiaoVien findByTenGiaoVienVaDiaChi(@Param("tenGiaoVien") String tenGiaVien,@Param("diaChi") String diaChi);
}
