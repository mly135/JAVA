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
 * Description: File�ļ�������
 * </p>
 * 
 * @author mengly
 * @date 2017-8-13 ����1:46:26
 */
public class FileTest {

	/**
	 * �ļ�����
	 */
	private File file = null;

	/**
	 * Ŀ¼����
	 */
	private File dir = null;

	/**
	 * java.io.File�� 
	 * 1.Ϊ�˿�ƽ̨��·��������\\����/������file����Ҳ�ǿ��Կ�ƽ̨�� 
	 * 2.file�ļ����Ա�ʾ�ļ������ļ���
	 * 3.�ļ��ķ�����Ҫ�漰������ɾ�������������������ļ��ڲ�����Ϣ
	 */

	/**
	 * �ļ����ƺ�·����ط���
	 *  1.getName() ��õ�ǰFile��������ơ� 
	 *  2.getPath() ��ǰFile��������·����
	 *  3.getAbsolutePath() ��õ�ǰFile����ľ���·���� 
	 *  4.getParent() ��ȡ��ǰFile����ĸ�·����
	 *  5.length() ��ȡ��ǰFile����洢ʱռ�õ��ֽ���������ֵ��õ����ļ���ʵ�ʴ�С���������ļ��ڴ洢ʱռ�õĿռ�����
	 *  6.lastModified() ��ȡ��ǰFile��������༭ʱ�䡣
	 */
	@Test
	public void testFile() {
		// ���·���ļ�
		File file = new File("file.txt");
		// ·��
		File filePath = new File("C:\\Users\\Administrator\\Desktop\\�����ļ���\\�ļ�");
		System.out.println("����·���ļ�");
		System.out.println("�ļ�����" + file.getName());
		System.out.println("·����" + file.getPath());
		System.out.println("����·����" + file.getAbsolutePath());
		System.out.println("��ȡ���ڵ�·����" + file.getParent());
		System.out.println("�ļ���С��" + file.length());
		System.out.println("���༭ʱ��" + new Date(file.lastModified()));
		System.out.println("·��");
		System.out.println("�ļ�����" + filePath.getName());
		System.out.println("·����" + filePath.getPath());
		System.out.println("����·����" + filePath.getAbsolutePath());
		System.out.println("��ȡ���ڵ�·����" + filePath.getParent());
		System.out.println("�ļ���С��" + filePath.length());
		System.out.println("���༭ʱ��" + new Date(filePath.lastModified()));

	}

	/**
	 * �ļ�������ɾ�� 1.createNewFile() �����ļ���·��������ڡ� 2.delete() ɾ���ļ������ļ��С�
	 * 
	 * @throws IOException
	 */
	@Test
	public void createFile() throws IOException {
		// file����
		File file = getInstanceFile();
		boolean isCreate = file.createNewFile();
		// boolean isDelete = file.delete();
		System.out.println("�Ƿ񴴽���" + isCreate);
		// System.out.println("�Ƿ�ɾ����"+isDelete);

	}

	/**
	 * ����ļ� 
	 * 1.exists() �жϵ�ǰFile�����Ƿ���� 
	 * 2.isDirectory() �жϵ�ǰFile�����Ƿ���Ŀ¼��
	 * 3.isFile() �жϵ�ǰFile�����Ƿ����ļ��� 
	 * 4.canRead() �жϵ�ǰFile�����Ƿ�ɶ��� 
	 * 5.canWrite() �жϵ�ǰFile�����Ƿ��ǿ�д��
	 * 
	 * @throws IOException
	 */
	@Test
	public void checkFile() throws IOException {
		file = getInstanceFile();
		System.out.println("�Ƿ���ڣ�" + file.exists());
		System.out.println("�Ƿ���·����" + file.isDirectory());
		System.out.println("�Ƿ����ļ���" + file.isFile());
		System.out.println("�Ƿ�ɶ�" + file.canRead());
		System.out.println("�Ƿ��д" + file.canWrite());

	}

	/**
	 * ����Ŀ¼�ȹط��� 
	 * 1.mkdir() ������ǰfile����Ŀ¼��������Ŀ¼�����ڡ� 
	 * 2.mkdirs() ������ǰfile����Ŀ¼,����Ŀ¼�����ڡ�
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
	 * ����file����
	 * 
	 * @return
	 * @throws IOException
	 */
	public File getInstanceFile() throws IOException {
		if (file == null) {
			file = new File(
					"C:\\Users\\Administrator\\Desktop\\�����ļ���\\�ļ�\\aa.txt");
		}
		return file;
	}

	/**
	 * ����file����
	 * 
	 * @return
	 */
	public File getInstanceDir() {
		if (file == null) {
			file = new File("C:\\Users\\Administrator\\Desktop\\�����ļ���");
		}
		return file;
	}
}
