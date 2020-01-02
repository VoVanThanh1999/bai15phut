package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
@Service
public class StudentsSevice {
	@Autowired
	StudentsDAO studentsDAO;
	
	//a. liệt kê tất cả các thông tin của thực thể
	public List<Student> getAll(Student student){
		
		return studentsDAO.findAll();	
		
	}	
	
	//b. thêm mới 1 thực thể
	public void InsertStudent(Student student) {
		studentsDAO.save(student);
	}
	
	//c. xóa 1 thực thể
	public void deleteOnethuexe(Integer masinvien) {
		
		studentsDAO.deleteById(masinvien);
		}
	//d. chỉnh sửa 1 thực thể
	public void UpdateStudent(Student student) {
		studentsDAO.save(student);
	}
	//e. tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
	public List<Student> getAllBynoiDinoiDenngayDi(String tensv, String diachi){
		Student student = new Student();
		student.setTensv(tensv);
		student.setDiachi(diachi);
		
		ExampleMatcher exampleMatcher = ExampleMatcher.matching()
				.withIgnorePaths("masinvien")
				.withIgnorePaths("ngaysinh");
		return studentsDAO.findAll(Example.of(student,exampleMatcher));
	}
	
}
