package com.codegnan.dao;

import java.util.ArrayList;
import java.util.List;

import com.codegnan.Exceptions.AttendenceNotFoundException;
import com.codegnan.model1.Attendence;

public class AttendenceDaoImpl implements AttendenceDao {
	List<Attendence>attendenceList=new ArrayList<>();

	@Override
	public void save(Attendence attendence) {
		attendenceList.add(attendence);//to add attendence to a list
		
		
	}

	@Override
	public List<Attendence> findAll() {
		// TODO Auto-generated method stub
		return attendenceList;
	}

	@Override
	public Attendence findBystudentId(int id) throws AttendenceNotFoundException {
		for(Attendence e:attendenceList) {
			if(e.getStudentId()==id) {
				return e;
			}
		}
		throw new AttendenceNotFoundException("attendence with id:"+id+"Not Found");
	}

		
	

	@Override
	public Attendence update(Attendence attendence) throws AttendenceNotFoundException {
		for(int i=0;i<attendenceList.size();i++) {
			if(attendenceList.get(i).getStudentId()==attendence.getStudentId()) {
				attendenceList.set(i, attendence);
				return attendence;
			}
		}
		throw new AttendenceNotFoundException("Attendence with id :"+attendence.getStudentId()
		+"not found cannot update");
	}

	@Override
	public void deleteBystudentId(int id) throws AttendenceNotFoundException {
		boolean found=false;
		for(int i=0;i<attendenceList.size();i++) {
			if(attendenceList.get(i).getStudentId()==id) {
				attendenceList.remove(i);
				found=true;
				break;
			}
		}
		if(! found) {
			throw new AttendenceNotFoundException("Attendence with id"+id
					+"not found cannot update");
		}
	}

	

}
