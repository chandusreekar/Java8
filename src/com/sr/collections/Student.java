package com.sr.collections;

public class Student {
	private int studentId;
	private String studentName;
	private long contantNo;
	private String branch;
	private int totalMarks;
	
	public int getTotalMarks() {
		return totalMarks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", contantNo=" + contantNo
				+ ", branch=" + branch + ", totalMarks=" + totalMarks + "]";
	}
	public Student(int studentId, String studentName, long contantNo, String branch, int totalMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.contantNo = contantNo;
		this.branch = branch;
		this.totalMarks = totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Student() {
		super();
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
	public long getContantNo() {
		return contantNo;
	}
	public void setContantNo(long contantNo) {
		this.contantNo = contantNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
