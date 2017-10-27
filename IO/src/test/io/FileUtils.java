package test.io;

import java.io.File;

public class FileUtils {
	/**
	 * 
	 * @Title: getInputTxtFile   
	 * @Description: 输入文本对象   
	 * @param @return    设定文件   
	 * @return File    返回类型   
	 * @throws
	 */
	public static File getInputTxtFile(){
		return  new File("C:\\Users\\mengly\\Desktop\\测试文件\\文本.txt");
	}
	
	/**
	 * 
	 * @Title: getOutputTxtFile   
	 * @Description: 输出文本对象   
	 * @param @return    设定文件   
	 * @return File    返回类型   
	 * @throws
	 */
	public static File getOutputTxtFile(){
		return  new File("C:\\Users\\mengly\\Desktop\\测试文件\\文本1.txt");
	}
	
	/**
	 * 
	 * @Title: getInputJpgFile   
	 * @Description: 输入图片对象   
	 * @param @return    设定文件   
	 * @return File    返回类型   
	 * @throws
	 */
	public static File getInputJpgFile(){
		return  new File("C:\\Users\\mengly\\Desktop\\测试文件\\图片.jpg");
	}
	
	/**
	 * 
	 * @Title: getOutputTxtFile   
	 * @Description: 输出图片对象   
	 * @param @return    设定文件   
	 * @return File    返回类型   
	 * @throws
	 */
	public static File getOutputJpgFile(){
		return  new File("C:\\Users\\mengly\\Desktop\\测试文件\\图片1.jpg");
	}
	
	/**
	 * 
	 * @Title: getInputWmvFile   
	 * @Description: 输入视频对象   
	 * @param @return    设定文件   
	 * @return File    返回类型   
	 * @throws
	 */
	public static File getInputWmvFile(){
		return  new File("C:\\Users\\mengly\\Desktop\\测试文件\\视频.wmv");
	}
	
	/**
	 * 
	 * @Title: getOutputTxtFile   
	 * @Description: 输出视频对象   
	 * @param @return    设定文件   
	 * @return File    返回类型   
	 * @throws
	 */
	public static File getOutputWmvFile(){
		return  new File("C:\\Users\\mengly\\Desktop\\测试文件\\视频1.wmv");
	}
}
