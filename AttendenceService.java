package com.codegnan.service;

import java.util.List;

import com.codegnan.Exceptions.AttendenceNotFoundException;
import com.codegnan.model1.Attendence;


public interface AttendenceService {
	public void addAttendence(Attendence attendence);

	public List<Attendence>getAllAttendence();

	public Attendence getAttendenceBystudentId(int id)throws AttendenceNotFoundException;

	public Attendence updateAttendence(Attendence attendence)throws AttendenceNotFoundException;

	public void deleteAttendence(int id)throws AttendenceNotFoundException;

	

}
