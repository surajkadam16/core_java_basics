package com.suraj.training.corejavafundamentals;

import com.suraj.training.corejavafundamentals.model.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class CoreJavaFundamentalsApplication {

	public static void main(String[] args) {
        List<Student> arrayList = new LinkedList<>();


        Student student1 = new Student(1,"Suraj");
        Student student2 = new Student(3,"Nakul");
        Student student3 = new Student(2,"Ajay");

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);


        Collections.sort(arrayList);
        //After sorting
        System.out.println("After Sorting: ");
        for (Student s : arrayList){
            System.out.println(s.getRollNo() + ": " + s.getName());
        }

        Collections.reverse(arrayList);

        //Student s = Collections.min(arrayList);
        System.out.println("After Sorting and Revers: ");

        for (Student s : arrayList){
        System.out.println(s.getRollNo() + ": " + s.getName());
        }
	}

}
