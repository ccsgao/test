package com.imooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 测试
 * @author gaozhichao3
 *
 */
public class CollectionTest {
	public List<Course> courses;
	
	public CollectionTest(){
		courses=new ArrayList<Course>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionTest ct=new CollectionTest();
		//ADD
		ct.testAdd();
		ct.testFor();
		
		ct.testListSort();
		ct.testFor();
	}

	/*
	 * 课程排序
	 */
	public void testListSort(){
		//根据元素的自然顺序 对指定列表按升序进行排序
		
//		Collections.sort(courses);
		Collections.sort(courses, new CourseComparator());
	}
	
	/*
	 * 添加课程
	 */
	public void testAdd(){
		courses.add(new Course("2","A"));
		courses.add(new Course("1", "G"));
		courses.add(new Course("3","D"));
	}
	
	/*
	 * 遍历输出
	 */
	public void testFor(){
		for(Course c : courses){
			System.out.println(c.id+"/"+c.name);
		}
	}
}
