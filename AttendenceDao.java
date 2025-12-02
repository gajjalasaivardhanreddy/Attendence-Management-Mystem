package com.codegnan.dao;

import java.util.List;

import com.codegnan.Exceptions.AttendenceNotFoundException;
import com.codegnan.model1.Attendence;

public interface AttendenceDao {
	public void save(Attendence attendence);//create or save Attendence
	public List<Attendence>findAll();//show all students
	//search the student by studentid
	public Attendence findBystudentId(int id)throws AttendenceNotFoundException;
	//update the student through studentid
	public Attendence update(Attendence attendence)throws AttendenceNotFoundException;
	//delete the student using studentid
	public void deleteBystudentId(int id)throws AttendenceNotFoundException;
}
