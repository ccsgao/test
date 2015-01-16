package com.imooc;

public class Course implements Comparable<Course> {
	public String id;
	public String name;
	
	public Course (String id,String name){
		this.id=id;
		this.name=name;
	}

	@Override
	public int compareTo(Course o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
//		return 0;
	}
}
