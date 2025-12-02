package com.codegnan.service;

import java.util.List;

import com.codegnan.Exceptions.AttendenceNotFoundException;
import com.codegnan.dao.AttendenceDao;
import com.codegnan.dao.AttendenceDaoImpl;
import com.codegnan.model1.Attendence;

public class AttendenceServiceImpl implements AttendenceService {
	AttendenceDao dao=new  AttendenceDaoImpl();

	@Override
	public void addAttendence(Attendence attendence) {
		dao.save(attendence);	
	}

	@Override
	public List<Attendence> getAllAttendence() {
		return dao.findAll();
		}

	@Override
	public Attendence getAttendenceBystudentId(int id) throws AttendenceNotFoundException {
		return dao.findBystudentId(id);
	}

	@Override
	public Attendence updateAttendence(Attendence attendence) throws AttendenceNotFoundException {
		
		return dao.update(attendence);
	}

	@Override
	public void deleteAttendence(int id) throws AttendenceNotFoundException {
		dao.deleteBystudentId(id);
		
	}
	}


