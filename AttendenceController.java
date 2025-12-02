package com.codegnan.controller;

import java.util.List;

import com.codegnan.Exceptions.AttendenceNotFoundException;

import com.codegnan.model1.Attendence;
import com.codegnan.service.AttendenceService;
import com.codegnan.service.AttendenceServiceImpl;

public class AttendenceController {
	public static void main(String[] args) {
		AttendenceService service=new AttendenceServiceImpl();
		
		//add employees
		service.addAttendence(new Attendence(1,"virat","present"));
		service.addAttendence(new Attendence(2,"kohli","absent"));
		service.addAttendence(new Attendence(3,"abdul","absent"));
		service.addAttendence(new Attendence(4,"samad","present"));
		service.addAttendence(new Attendence(5,"Rahul","absent"));
		System.out.println("students added successfully");
		System.out.println("All students");
		System.out.println("------------------------------");
		List<Attendence>attendences=service.getAllAttendence();
		for(Attendence att:attendences) {
			System.out.println(att);
		}
		//get student by id 2
		System.out.println("Fetching student with ID:2");
		try {
			Attendence FetchAttendence=service.getAttendenceBystudentId(2);
			System.out.println(FetchAttendence);
		} catch (AttendenceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//update the employee with id 3
		System.out.println("update the student with  id 3");
		try {
			Attendence updated=service.updateAttendence
					(new Attendence(3,"mallesh","absent"));
			System.out.println("Updated student:"+updated);
		} catch (AttendenceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//delete employee with id 1
		try {
			service.deleteAttendence(1);
			System.out.println("student deleted successfully");
		} catch (AttendenceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after all modification students list");
		System.out.println("------------------------------");
		List<Attendence>attendences1=service.getAllAttendence();
		for(Attendence att:attendences1) {
			System.out.println(att);

	}

}
}


