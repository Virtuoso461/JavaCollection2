package StudyDay2;
import java.util.*;
public class Co {
	public static void main(String[] agrs) {
		Collection c1 = new ArrayList();
		Student s1 = new Student("小邱",10);
		Student s2 = new Student("老邱",30);
		Student s3 = new Student("中不溜邱",20);
		
		c1.add(s1);
		c1.add(s2);
		c1.add(s3);
		Object[] objs = c1.toArray();
		for(int i =0;i<objs.length;i++) {
			Student s= (Student)objs[i];
			System.out.println(s.getName()+"---"+s.getAge());
		}
		Collection c2 = new ArrayList();
		
		Teacher t1 = new Teacher("小邱老师",40);
		Teacher t2 = new Teacher("老邱老师",60);
		Teacher t3 = new Teacher("中不溜邱老师",50);
		
		c2.add(t1);
		c2.add(t2);
		c2.add(t3);
		
		Object[] objs2 = c2.toArray();
		for(int i=0;i<objs2.length;i++) {
			Teacher t = (Teacher)objs2[i];
			System.out.println(t.getName()+t.getAge());
		}
	}
}