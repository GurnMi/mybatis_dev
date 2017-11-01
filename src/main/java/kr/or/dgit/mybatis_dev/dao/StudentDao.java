package kr.or.dgit.mybatis_dev.dao;

import java.util.List;

import kr.or.dgit.mybatis_dev.dto.Student;

public interface StudentDao {
	Student selectStudentByNo(Student student);
	List<Student> selectStudentByAll();
	
	Student selectStudentByNoAPI(Student student);
	List<Student> selectStudentByAllAPI();
	
	int insertStudent(Student student);
	int insertStudentWithAPI(Student student);
	
	int insertStudentAutoInc(Student student);
	
	int updateStudent(Student student);
	int updateStudentWithAPI(Student student);
	
	int deleteStudent(int id);
	int deleteStudentWithAPI(int id);
}
