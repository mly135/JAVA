package test;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface AnnocationTest {
	
/*	reader = Resources.getResourceAsReader("config/Configure.xml");
    sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    sqlSessionFactory.getConfiguration().addMapper(IUser.class);*/
	
	@Select(" select * from blog where id = #{id}")
	public BlogMapper getBlogById(@Param("id")int id);

}
