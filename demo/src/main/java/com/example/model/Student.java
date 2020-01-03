package com.example.model;

import javax.persistence.*;

@Entity
@Table (name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		public int masinvien;
		public String tensv;
		public String diachi;
		public int ngaysinh;
		
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(int masinvien, String tensv, String diachi, int ngaysinh) {
			super();
			this.masinvien = masinvien;
			this.tensv = tensv;
			this.diachi = diachi;
			this.ngaysinh = ngaysinh;
		}

		public int getMasinvien() {
			return masinvien;
		}

		public void setMasinvien(int masinvien) {
			this.masinvien = masinvien;
		}

		public String getTensv() {
			return tensv;
		}

		public void setTensv(String tensv) {
			this.tensv = tensv;
		}

		public String getDiachi() {
			return diachi;
		}
		
		public void setDiachi(String diachi) {
			this.diachi = diachi;
		}

		public int getNgaysinh() {
			return ngaysinh;
		}

		public void setNgaysinh(int ngaysinh) {
			this.ngaysinh = ngaysinh;
		}

		@Override
		public String toString() {
			return "Student [masinvien=" + masinvien + ", tensv=" + tensv + ", diachi=" + diachi + ", ngaysinh="
					+ ngaysinh + "]";
		}
		
		
		
}
