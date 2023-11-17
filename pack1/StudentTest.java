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
		if(rollno==s.rollno)  
			return 0;  
			else if(rollno>s.rollno)  
			return 1;  
			else  
			return -1;  
	}
	}

