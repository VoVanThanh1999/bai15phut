package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BaoVe")
public class BaoVe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int maBaoVe;
	private String tenBaoVe;
	private int tuoiBaoVe;
	private String diaChi;
	private String email;
	private int phone;
	private int luong;
	public int getMaBaoVe() {
		return maBaoVe;
	}
	public void setMaBaoVe(int maBaoVe) {
		this.maBaoVe = maBaoVe;
	}
	public String getTenBaoVe() {
		return tenBaoVe;
	}
	public void setTenBaoVe(String tenBaoVe) {
		this.tenBaoVe = tenBaoVe;
	}
	public int getTuoiBaoVe() {
		return tuoiBaoVe;
	}
	public void setTuoiBaoVe(int tuoiBaoVe) {
		this.tuoiBaoVe = tuoiBaoVe;
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
	public BaoVe(int maBaoVe, String tenBaoVe, int tuoiBaoVe, String diaChi, String email, int phone, int luong) {
		super();
		this.maBaoVe = maBaoVe;
		this.tenBaoVe = tenBaoVe;
		this.tuoiBaoVe = tuoiBaoVe;
		this.diaChi = diaChi;
		this.email = email;
		this.phone = phone;
		this.luong = luong;
	}
	public BaoVe() {
		super();
	}
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}
	
}