package com.excelr.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
	private int rno;
	private String sname;
	private String gender;
	private String sk[];
	
	public Student() {}
	
	

	public Student(int rno, String sname, String gender, String[] sk) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.gender = gender;
		this.sk = sk;
	}



	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	public String[] getSk() {
		return sk;
	}



	public void setSk(String[] sk) {
		this.sk = sk;
	}



	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", gender=" + gender + ", sk=" + Arrays.toString(sk) + "]";
	}

	
	
}
