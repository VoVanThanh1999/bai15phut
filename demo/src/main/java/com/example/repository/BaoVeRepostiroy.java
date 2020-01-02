package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.BaoVe;

@Repository

public interface BaoVeRepostiroy extends JpaRepository<BaoVe, Integer>{
	/*
	 * @Query(value =
	 * "SELECT u FROM u where u.tenBaoVe =: tenBaoVe and u.diaChi = :diaChi"
	 * ,nativeQuery =true) public BaoVe findByTenBaoVeVaDiaChi(@Param("tenBaoVe")
	 * String tenBaoVe,@Param("diaChi") String diaChi);
	 */
}
