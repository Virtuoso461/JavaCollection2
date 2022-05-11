package StudyDay2;
import java.io.*;
public class Test {
	public static void main(String[] args) {
		File f =new File("D:\\Test.txt");
		System.out.println(f.getName()+"是刻度的吗:\n"+f.canRead());
		System.out.println(f.getName()+"的长度:\n"+f.length());
		System.out.println(f.getName()+"的绝对路径:\n"+f.getAbsolutePath());
		if(!f.exists()) {
			try {
				f.createNewFile();
				System.out.println("在当前目录(运行程序的目录)下创建了新文件:\n"+f.getName());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
