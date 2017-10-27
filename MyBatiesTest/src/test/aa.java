package test;

import org.apache.ibatis.annotations.Param;

public interface aa{
	
	BlogMapper getId(@Param("id")int id);
}
