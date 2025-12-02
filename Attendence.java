package com.codegnan.model1;

public class Attendence {
	private int studentId;;
	private String studentName;
	private String status;
	public Attendence() {
		super();
		// TODO Auto-generated constructor stub
	}	


public Attendence(int studentId, String studentName, String status) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.status = status;
}


public int getStudentId() {
	return studentId;
}


public void setStudentId(int studentId) {
	this.studentId = studentId;
}


public String getStudentName() {
	return studentName;
}


public void setStudentName(String studentName) {
	this.studentName = studentName;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


@Override
public String toString() {
	return "Attendence [studentId=" + studentId + ", studentName=" + studentName + ", status=" + status + "]";
}

}
