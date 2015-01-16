package com.imooc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ����
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
	 * �γ�����
	 */
	public void testListSort(){
		//����Ԫ�ص���Ȼ˳�� ��ָ���б������������
		
//		Collections.sort(courses);
		Collections.sort(courses, new CourseComparator());
	}
	
	/*
	 * ��ӿγ�
	 */
	public void testAdd(){
		courses.add(new Course("2","A"));
		courses.add(new Course("1", "G"));
		courses.add(new Course("3","D"));
	}
	
	/*
	 * �������
	 */
	public void testFor(){
		for(Course c : courses){
			System.out.println(c.id+"/"+c.name);
		}
	}
}
