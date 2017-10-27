package test.io;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.Test;

/**
 * <p>
 * Title: FileTest
 * </p>
 * <p>
 * Description: File文件测试类
 * </p>
 * 
 * @author mengly
 * @date 2017-8-13 下午1:46:26
 */
public class FileTest {

	/**
	 * 文件对象
	 */
	private File file = null;

	/**
	 * 目录对象
	 */
	private File dir = null;

	/**
	 * java.io.File类 
	 * 1.为了跨平台，路径可以用\\或者/，所以file对象也是可以跨平台的 
	 * 2.file文件可以表示文件或者文件夹
	 * 3.文件的方法主要涉及新增、删除和涉重命名，不及文件内部的信息
	 */

	/**
	 * 文件名称和路径相关方法
	 *  1.getName() 获得当前File对象的名称。 
	 *  2.getPath() 当前File对象的相对路径。
	 *  3.getAbsolutePath() 获得当前File对象的绝对路径。 
	 *  4.getParent() 获取当前File对象的父路径。
	 *  5.length() 获取当前File对象存储时占用的字节数。该数值获得的是文件的实际大小，而不是文件在存储时占用的空间数。
	 *  6.lastModified() 获取当前File对象的最后编辑时间。
	 */
	@Test
	public void testFile() {
		// 相对路径文件
		File file = new File("file.txt");
		// 路径
		File filePath = new File("C:\\Users\\Administrator\\Desktop\\测试文件库\\文件");
		System.out.println("绝对路径文件");
		System.out.println("文件名：" + file.getName());
		System.out.println("路径：" + file.getPath());
		System.out.println("绝对路径：" + file.getAbsolutePath());
		System.out.println("获取父节点路径：" + file.getParent());
		System.out.println("文件大小：" + file.length());
		System.out.println("最后编辑时间" + new Date(file.lastModified()));
		System.out.println("路径");
		System.out.println("文件名：" + filePath.getName());
		System.out.println("路径：" + filePath.getPath());
		System.out.println("绝对路径：" + filePath.getAbsolutePath());
		System.out.println("获取父节点路径：" + filePath.getParent());
		System.out.println("文件大小：" + filePath.length());
		System.out.println("最后编辑时间" + new Date(filePath.lastModified()));

	}

	/**
	 * 文件创建和删除 1.createNewFile() 创建文件，路径必须存在。 2.delete() 删除文件或者文件夹。
	 * 
	 * @throws IOException
	 */
	@Test
	public void createFile() throws IOException {
		// file对象
		File file = getInstanceFile();
		boolean isCreate = file.createNewFile();
		// boolean isDelete = file.delete();
		System.out.println("是否创建：" + isCreate);
		// System.out.println("是否删除："+isDelete);

	}

	/**
	 * 检测文件 
	 * 1.exists() 判断当前File对象是否存在 
	 * 2.isDirectory() 判断当前File对象是否是目录。
	 * 3.isFile() 判断当前File对象是否是文件。 
	 * 4.canRead() 判断当前File对象是否可读。 
	 * 5.canWrite() 判断当前File对象是否是可写。
	 * 
	 * @throws IOException
	 */
	@Test
	public void checkFile() throws IOException {
		file = getInstanceFile();
		System.out.println("是否存在：" + file.exists());
		System.out.println("是否是路径：" + file.isDirectory());
		System.out.println("是否是文件：" + file.isFile());
		System.out.println("是否可读" + file.canRead());
		System.out.println("是否可写" + file.canWrite());

	}

	/**
	 * 创建目录先关方法 
	 * 1.mkdir() 创建当前file对象目录，不允许父目录不存在。 
	 * 2.mkdirs() 创建当前file对象目录,允许父目录不存在。
	 * 
	 * @throws IOException
	 * 
	 */
	@Test
	public void createDir() throws IOException {
		dir = getInstanceDir();
		System.out.println(dir.mkdir());
		System.out.println(dir.mkdirs());

	}

	/**
	 * 创建file对象
	 * 
	 * @return
	 * @throws IOException
	 */
	public File getInstanceFile() throws IOException {
		if (file == null) {
			file = new File(
					"C:\\Users\\Administrator\\Desktop\\测试文件库\\文件\\aa.txt");
		}
		return file;
	}

	/**
	 * 创建file对象
	 * 
	 * @return
	 */
	public File getInstanceDir() {
		if (file == null) {
			file = new File("C:\\Users\\Administrator\\Desktop\\测试文件库");
		}
		return file;
	}
}
