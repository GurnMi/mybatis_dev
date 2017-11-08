package kr.or.dgit.mybatis_dev.service;

import java.util.List;
import java.util.Map;

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
	
	public List<Student> findStudentByAllForResutlMap(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForResutlMap();
		}
	}
	
	public List<Student> findStudentByAllForResutlMapWithAPI(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForResutlMapWithAPI();
		}
	}
	
	public List<Map<String, Object>> findStudentByAllForHashMap(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForHashMap();
		}
	}
	
	public List<Map<String, Object>> findStudentByAllForHashMapWithAPI(){
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByAllForHashMapWithAPI();
		}
	}
	
	
	public Student findStudentByNoForResultMapExtends(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoForResultMapExtends(student);
		}
	}
	
	public Student findStudentByNoForResultMapExtendsWithAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoForResultMapExtendsWithAPI(student);
		}
	}
	
	public Student selectStudentByNoAssociation(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoAssociation(student);
		}
	}
	
	public Student selectStudentByNoAssociationWithAPI(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentByNoAssociationWithAPI(student);
		}
	}
	
	
	public int insertEnumStudent(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertEnumStudent(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public int insertEnumStudentWithAPI(Student student) {
		int res=-1;
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			res = dao.insertEnumStudentWithAPI(student);
			sqlSession.commit();
		}
		return res;
	}
	
	public Student findAllStudentByParam(String name, String email) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectAllStudentByParam(name, email);
		}
	}
	
	public Student findAllStudentByStdent(Student student) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectAllStudentByStdent(student);
		}
	}
	
	public Student findAllStudentByMap(Map<String, String> map) {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectAllStudentByMap(map);
		}
	}
	
	public Map<Integer, String> findStudentForMap() {
		try(SqlSession sqlSession = MyBatisSqlSessionFactory.getSqlSessionFactory().openSession();){
			StudentDao dao = new StudentDaoImpl(sqlSession);
			return dao.selectStudentForMap();
		}
	}
	
	
}
