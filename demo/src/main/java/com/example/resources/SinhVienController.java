package com.example.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class SinhVienController {
	@Autowired
	StudentsSevice suStudentsSevice;
	
	//a. liệt kê tất cả các thông tin của thực thể
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getAll")
	public List<Student> getAll(Student student){
		
		return suStudentsSevice.getAll(student);
	}
	
	//b.  thêm mới 1 thực thể
	@CrossOrigin(value = "*")
	@RequestMapping(value="/Insert")
	public boolean InsertStudent(@RequestBody Student student) {
		
		suStudentsSevice.InsertStudent(student);
		return true;
	}
	
	//c. xóa 1 thực thể
	@CrossOrigin(value = "*")
	@RequestMapping(value="/delOne")
	public boolean deleteOneStudent(@RequestBody Student student) {
		suStudentsSevice.deleteOnethuexe(student.getMasinvien());
		return true;
	}
	//d. chỉnh sửa 1 thực thể
	@CrossOrigin(value = "*")
	@RequestMapping(value="/Update")
	public boolean UpdateStudent(@RequestBody Student student) {
		
		suStudentsSevice.UpdateStudent(student);
		return true;
	}
	//e. tìm kiếm các thực thể theo 1 lúc 2 thuộc tính ví dụ: tenSV, diaChi(tên và địa chỉ giống nhau)
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/search")
	public List<Student> getALL(@RequestParam(name="tensv") String tensv,
									@RequestParam(name="diachi") String diachi){

	return suStudentsSevice.getAllBynoiDinoiDenngayDi(tensv,diachi);
	}
	
}
