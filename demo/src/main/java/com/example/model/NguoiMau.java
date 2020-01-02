package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nguoimau")
public class NguoiMau {
@Id
private int manguoimau;
private String tennguoimau;
private int tuoinguoimau;
private String diachi;
private String email;
private int phone;
private int luong;
public int getManguoimau() {
	return manguoimau;
}
public void setManguoimau(int manguoimau) {
	this.manguoimau = manguoimau;
}
public String getTennguoimau() {
	return tennguoimau;
}
public void setTennguoimau(String tennguoimau) {
	this.tennguoimau = tennguoimau;
}
public int getTuoinguoimau() {
	return tuoinguoimau;
}
public void setTuoinguoimau(int tuoinguoimau) {
	this.tuoinguoimau = tuoinguoimau;
}
public String getDiachi() {
	return diachi;
}
public void setDiachi(String diachi) {
	this.diachi = diachi;
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
public NguoiMau(int manguoimau, String tennguoimau, int tuoinguoimau, String diachi, String email, int phone,
		int luong) {
	super();
	this.manguoimau = manguoimau;
	this.tennguoimau = tennguoimau;
	this.tuoinguoimau = tuoinguoimau;
	this.diachi = diachi;
	this.email = email;
	this.phone = phone;
	this.luong = luong;
}
public NguoiMau() {
	super();
}

}