package pack1;


public class StudentTest implements Comparable<StudentTest> {

	int rollno;
	int age;
	String name;
	
	
	
	StudentTest(int rollno,int age,String name)
	{
		 this.rollno=rollno;
		 this.name=name;
		 this.age=age;
		
	}
	
@Override
	public int compareTo(StudentTest s) {
		if(age==s.age)  
			return 0;  
			else if(age>s.age)  
			return 1;  
			else  
			return -1;  
	}
	}

