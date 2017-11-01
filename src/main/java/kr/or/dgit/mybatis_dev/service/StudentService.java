package kr.or.dgit.mybatis_dev.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev.dao.StudentDao;
import kr.or.dgit.mybatis_dev.dao.StudentDaoImpl;
import kr.or.dgit.mybatis_dev.dto.Student;
import kr.or.dgit.mybatis_dev.util.MyBatisSqlSessionFactory;

public class StudentService {
	public Student findStudentByNo(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNo(student);
		}
	}
	
	public List<Student> findStudentByAll(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAll();
		}
	}
	
	public Student findStudentByNoAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNo(student);
		}
	}
	
	public List<Student> findStudentByAllAPI(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAll();
		}
	}
	
	public int insertStudent(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudent(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int insertStudentWithAPI(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudentWithAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int insertStudentAutoInc(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertStudentAutoInc(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int updateStudent(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.updateStudent(student);
			sqlSession.commit();
			return res;
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally{
			sqlSession.close();
		}
		return 1;
	}
	
	public int updateStudentWithAPI(Student student) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.updateStudentWithAPI(student);
			sqlSession.commit();
			return res;
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally{
			sqlSession.close();
		}
		return 1;
	}
	
	public int deleteStudent(int id) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.deleteStudent(id);
			sqlSession.commit();
			return res;
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally{
			sqlSession.close();
		}
		return 1;
	}
	
	public int deleteStudentWithAPI(int id) {
		SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();
		try {
			StudentDao dao = new StudentDaoImpl(sqlSession);
			int res = dao.deleteStudentWithAPI(id);
			sqlSession.commit();
			return res;
		}catch (Exception e) {
			sqlSession.rollback();
			e.printStackTrace();
		} finally{
			sqlSession.close();
		}
		return 1;
	}
	
}
