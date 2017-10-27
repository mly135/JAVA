package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class MyBatiesTest {
	public static void main(String[] args){

		String resource = "configuration.xml";
		InputStream inputStream = null;
		
		//��ȡ������ ����1
		/*
		inputStream = MyBatiesTest.class.getClassLoader().getResourceAsStream(resource);
		*/
		
		//��ȡ����������2
		/*try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//��ȡ����������3
		try {
			inputStream = Resources.getResourceAsStream(MyBatiesTest.class.getClassLoader(), resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		/**
		 * SqlSessionFactoryBuilder
		 * SqlSessionFactory
		 * SqlSession
		 */
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			
		}
		 SqlSession sqlSession = sqlSessionFactory.openSession();
		 
		 /** ��ѯ����*/
		 /*//����һ XML��ʽ
		 String lcazz = "BlogMapper.selectBlog";
		 BlogMapper blog = sqlSession.selectOne(lcazz, 1);
		 System.out.println(blog.toString());
		 
		 //������ javaע�ͷ�ʽ(��̫�ʺϸ����߼�ҵ��)
		 //�ӿ�ʹ��ǰҪע����
		 sqlSessionFactory.getConfiguration().addMapper(IBlogMapper.class);
		 IBlogMapper iblog=sqlSession.getMapper(IBlogMapper.class);
		 BlogMapper blogs = iblog.selectBlog(1);
		 System.out.println(blogs);*/
		
		 
		 /** ���뷽��*/
		 /*String insert = "BlogMapper.insertBlog";
		 BlogMapper blogInsert = new BlogMapper();
		 blogInsert.setId(1);
		 blogInsert.setName("���id");
		 sqlSession.insert(insert, blogInsert);
		 sqlSession.commit();*/
		 
		 /**���·���*/
		 /*String insert = "BlogMapper.selectBlog";
		 BlogMapper blog = sqlSession.selectOne(insert, 1);
		 blog.setName("update name");
		 String update = "BlogMapper.updatetBlog";
		 sqlSession.update(update, blog);
		 sqlSession.commit();*/
		 
		 /**ɾ������*/
	/*	 String insert = "BlogMapper.selectBlog";
		 BlogMapper blog = sqlSession.selectOne(insert, 1);
		 blog.setName("update name");
		 String update = "BlogMapper.deleteBlog";
		 sqlSession.delete(update, blog);
		 sqlSession.commit();*/
		 
		/* String clazz = "BlogMapper.selectReplaceSql";
		 BlogMapper blog = sqlSession.selectOne(clazz, 1);
	     System.out.println(blog.toString());
		*/
		 
		 sqlSession.close();
	}
	@Test
	public void testInterFace() throws IOException{
		String resource = "configuration.xml";
		InputStream inputStream = null;
		
		//��ȡ����������3
		inputStream = Resources.getResourceAsStream(MyBatiesTest.class.getClassLoader(), resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		aa mapper = sqlSession.getMapper(aa.class);
		BlogMapper blogMapper = mapper.getId(0);
		System.out.println(blogMapper);
	}
	
	@Test
	public void testAnnocation() throws IOException{
		String resource = "configuration.xml";
		InputStream inputStream = null;
		
		//��ȡ����������3
		inputStream = Resources.getResourceAsStream(MyBatiesTest.class.getClassLoader(), resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		AnnocationTest test = sqlSession.getMapper(AnnocationTest.class);
		BlogMapper blog = test.getBlogById(4);
		System.out.println(blog.toString());
	}

}