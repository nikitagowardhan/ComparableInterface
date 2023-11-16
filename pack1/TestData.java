package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestData {
	
public static void main(String[] args) {
		
	ArrayList<StudentTest>a = new ArrayList<StudentTest>();
	a.add(new StudentTest(101, 27, "Vijay"));
	a.add(new StudentTest(102, 24, "Ajay"));
	a.add(new StudentTest(103, 25, "Nil"));
	
	Collections.sort(a);
	
	for (StudentTest st : a) {
        System.out.println(st.rollno + " " + st.name + " " + st.age);
	
	
	}

}
}