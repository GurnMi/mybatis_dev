package kr.or.dgit.mybatis_dev.dao;

import java.util.List;
import java.util.Map;

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
	
	List<Student> selectStudentByAllForResutlMap();
	List<Student> selectStudentByAllForResutlMapWithAPI();
	
	
	List<Map<String, Object>> selectStudentByAllForHashMap();
	List<Map<String, Object>> selectStudentByAllForHashMapWithAPI();
	
	Student selectStudentByNoForResultMapExtends(Student student);
	Student selectStudentByNoForResultMapExtendsWithAPI(Student student);
	
	Student selectStudentByNoAssociation(Student student);
	Student selectStudentByNoAssociationWithAPI(Student student);
	
	int insertEnumStudent(Student student);
	int insertEnumStudentWithAPI(Student student);
	
	Student selectAllStudentByParam(String name, String email);
	Student selectAllStudentByStdent(Student student);
	Student selectAllStudentByMap(Map<String, String> map);
	
	Map<Integer, String> selectStudentForMap();
}
