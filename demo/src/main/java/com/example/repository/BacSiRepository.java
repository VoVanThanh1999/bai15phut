package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.BacSi;

@Repository
@Transactional
public interface BacSiRepository extends JpaRepository<BacSi, Integer>{
	/*
	 * @Query(value =
	 * "SELECT u FROM u where u.tenBacSi =: tenBacSi and u.diaChi = :diaChi"
	 * ,nativeQuery=true)
	 */
//	public BacSi findByTenBacSiVaDiaChi(@Param("tenBacSi") String tenBacSi,@Param("diaChi") String diaChi);
}
