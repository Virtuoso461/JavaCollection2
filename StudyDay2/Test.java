package StudyDay2;
import java.io.*;
public class Test {
	public static void main(String[] args) {
		File f =new File("D:\\Test.txt");
		System.out.println(f.getName()+"�ǿ̶ȵ���:\n"+f.canRead());
		System.out.println(f.getName()+"�ĳ���:\n"+f.length());
		System.out.println(f.getName()+"�ľ���·��:\n"+f.getAbsolutePath());
		if(!f.exists()) {
			try {
				f.createNewFile();
				System.out.println("�ڵ�ǰĿ¼(���г����Ŀ¼)�´��������ļ�:\n"+f.getName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
