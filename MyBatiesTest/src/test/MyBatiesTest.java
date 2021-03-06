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
		
		//获取输入流 方法1
		/*
		inputStream = MyBatiesTest.class.getClassLoader().getResourceAsStream(resource);
		*/
		
		//获取输入流方法2
		/*try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		//获取输入流方法3
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
		 
		 /** 查询方法*/
		 /*//方法一 XML方式
		 String lcazz = "BlogMapper.selectBlog";
		 BlogMapper blog = sqlSession.selectOne(lcazz, 1);
		 System.out.println(blog.toString());
		 
		 //方法二 java注释方式(不太适合复杂逻辑业务)
		 //接口使用前要注册下
		 sqlSessionFactory.getConfiguration().addMapper(IBlogMapper.class);
		 IBlogMapper iblog=sqlSession.getMapper(IBlogMapper.class);
		 BlogMapper blogs = iblog.selectBlog(1);
		 System.out.println(blogs);*/
		
		 
		 /** 插入方法*/
		 /*String insert = "BlogMapper.insertBlog";
		 BlogMapper blogInsert = new BlogMapper();
		 blogInsert.setId(1);
		 blogInsert.setName("随机id");
		 sqlSession.insert(insert, blogInsert);
		 sqlSession.commit();*/
		 
		 /**更新方法*/
		 /*String insert = "BlogMapper.selectBlog";
		 BlogMapper blog = sqlSession.selectOne(insert, 1);
		 blog.setName("update name");
		 String update = "BlogMapper.updatetBlog";
		 sqlSession.update(update, blog);
		 sqlSession.commit();*/
		 
		 /**删除方法*/
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
		
		//获取输入流方法3
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
		
		//获取输入流方法3
		inputStream = Resources.getResourceAsStream(MyBatiesTest.class.getClassLoader(), resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		AnnocationTest test = sqlSession.getMapper(AnnocationTest.class);
		BlogMapper blog = test.getBlogById(4);
		System.out.println(blog.toString());
	}

}
