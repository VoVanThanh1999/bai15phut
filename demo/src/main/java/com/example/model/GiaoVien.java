package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "giaovien")
public class GiaoVien {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int maGiaoVien;
	private String tenGiaoVien;
	private int tuoiGiaoVien;
	private String diaChi;
	private String email;
	private int phone;
	private int luong;
	
	
	public GiaoVien() {
		super();
	}
	public GiaoVien(int maGiaoVien, String tenGiaoVien, int tuoiGiaoVien, String diaChi, String email, int phone,
			int luong) {
		super();
		this.maGiaoVien = maGiaoVien;
		this.tenGiaoVien = tenGiaoVien;
		this.tuoiGiaoVien = tuoiGiaoVien;
		this.diaChi = diaChi;
		this.email = email;
		this.phone = phone;
		this.luong = luong;
	}
	public int getMaGiaoVien() {
		return maGiaoVien;
	}
	public void setMaGiaoVien(int maGiaoVien) {
		this.maGiaoVien = maGiaoVien;
	}
	public String getTenGiaoVien() {
		return tenGiaoVien;
	}
	public void setTenGiaoVien(String tenGiaoVien) {
		this.tenGiaoVien = tenGiaoVien;
	}
	public int getTuoiGiaoVien() {
		return tuoiGiaoVien;
	}
	public void setTuoiGiaoVien(int tuoiGiaoVien) {
		this.tuoiGiaoVien = tuoiGiaoVien;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	
	
}
