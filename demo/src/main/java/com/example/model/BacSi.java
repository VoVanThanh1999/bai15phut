package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bacsi")
public class BacSi {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int maBacSi;
	private String tenBacSi;
	private int tuoiBacSi;
	private String diaChi;
	private String email;
	private int phone;
	private int luong;
	
	
	public BacSi() {
		super();
	}
	public BacSi(int maBacSi, String tenBacSi, int tuoiBacSi, String diaChi, String email, int phone, int luong) {
		super();
		this.maBacSi = maBacSi;
		this.tenBacSi = tenBacSi;
		this.tuoiBacSi = tuoiBacSi;
		this.diaChi = diaChi;
		this.email = email;
		this.phone = phone;
		this.luong = luong;
	}
	public int getMaBacSi() {
		return maBacSi;
	}
	public void setMaBacSi(int maBacSi) {
		this.maBacSi = maBacSi;
	}
	public String getTenBacSi() {
		return tenBacSi;
	}
	public void setTenBacSi(String tenBacSi) {
		this.tenBacSi = tenBacSi;
	}
	public int getTuoiBacSi() {
		return tuoiBacSi;
	}
	public void setTuoiBacSi(int tuoiBacSi) {
		this.tuoiBacSi = tuoiBacSi;
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
