package class5;

public class Test {

	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.setName("Anisul");
		t.setGender("male");
		t.setPhone(2344555);
		t.setUniversity("city univerersity");
		System.out.println("name="+t.getName()+"  gender="+t.getGender()+"  phone="+t.getPhone()+"university="+t.getUniversity());
		
		
		Teacher t1=new Teacher("helal","male",3322222,"newyork university");
		System.out.println("name="+t1.getName()+"  gender="+t1.getGender()+"  phone="+t1.getPhone()+"university="+t1.getUniversity());
		

	}
	}


