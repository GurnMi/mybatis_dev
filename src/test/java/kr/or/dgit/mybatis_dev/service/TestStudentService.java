package kr.or.dgit.mybatis_dev.service;



import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev.dto.Student;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestStudentService {

	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

	@Test
	public void test1FindStudentByNo() {
		Student student = new Student();
		student.setStudId(1);
		
		Student findStudent = studentService.findStudentByNo(student);
		Assert.assertEquals(student.getStudId(), findStudent.getStudId());
		
	}
	
	@Test
	public void test2FindStudentByNo() {
		List<Student> lists=studentService.findStudentByAll();
		Assert.assertNotNull(lists);
		
	}
	
	@Test
	public void test3FindStudentByNoAPI() {
		Student student = new Student();
		student.setStudId(1);
		
		Student selectStudent = studentService.findStudentByNoAPI(student);
		Assert.assertEquals(student.getStudId(), selectStudent.getStudId());
		
	}
	
	@Test
	public void test4FindStudentByNoAPI() {
		List<Student> lists=studentService.findStudentByAllAPI();
		Assert.assertNotNull(lists);
		
	}
	
	@Test
	public void testUpdateStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		
		Student student = new Student();
		student.setStudId(1);
		student.setName("timothy");
		student.setEmail("test@ste.adk");
		student.setDob(new Date());
		student.setPhone(new PhoneNumber("978-1234-1234"));
		
		int result = studentService.updateStudent(student);
		Assert.assertEquals(1, result);
		
		student.setEmail("timothy@gamil.com");
		student.setDob(new GregorianCalendar(1988,04,25).getTime());
		student.setPhone(new PhoneNumber("123-1234-1234"));
		
		result = studentService.updateStudent(student);
		Assert.assertEquals(1, result);
	}
	
	@Test
	public void testDeleteStudent() {
		int deleteStudent = studentService.deleteStudent(3);
		Assert.assertEquals(1, deleteStudent);
		
		deleteStudent  = studentService.deleteStudentWithAPI(4);
		Assert.assertEquals(1, deleteStudent);
	}
	
/*	@Test
	public void testInsertStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		
		Student student = new Student(3, "홍길동", "lee@test", new PhoneNumber("010-1234-1234"), newDate.getTime());
		int res = studentService.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testInsertStudentAPI() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		
		Student student = new Student(4, "홍길동", "lee@test", new PhoneNumber("010-1234-1234"), newDate.getTime());
		int res = studentService.insertStudentWithAPI(student);
		Assert.assertEquals(1, res);
	}*/
	
/*	@Test
	public void testInsertStudentAutoInc() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2,28);
		
		Student student = new Student();
		student.setName("홍길동4");
		student.setEmail("test@ste.adk");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		
		int res = studentService.insertStudentAutoInc(student);
		Assert.assertEquals(1, res);
	}*/
	


}
