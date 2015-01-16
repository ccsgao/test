package com.imooc;

import java.util.List;

public class Student implements Comparable<Student> {
	public String id;
	public String name;
	
	public List<Course> courses;

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
//		return 0;
	}
	
	
}
