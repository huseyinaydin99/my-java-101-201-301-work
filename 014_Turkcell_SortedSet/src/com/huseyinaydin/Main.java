package com.huseyinaydin;

import java.util.Iterator;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*SortedSet<Integer> integers = new TreeSet<>(); //ASC ascending
		integers.add(10);
		integers.add(3);
		integers.add(7);
		integers.add(500);
		integers.add(-1);
		integers.add(44);
		integers.forEach(System.out::println);
		
		System.out.println("----- ----- ----- -----");
		
		Iterator<Integer> iterator = integers.iterator();
		for (Integer integer : integers) {
			System.out.println(integer);
		}

		System.out.println("----- ----- ----- -----");
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}*/
		/*SortedSet<Student> names = new TreeSet<>();
		names.add(new Student(1,"Ahmet"));
		names.add(new Student(2, "Mehmet"));
		names.add(new Student(3, "Zımzımettin"));
		
		Iterator<Student> iterator = names.iterator();
		
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student.getId() + " - " + student.getName());
		}*/
		//System.out.println(2 % 12);
		/*for(int i = 0; i < 60; i++) {
			//System.out.println(i + " - " + i % 12);
			if(i == 52) break;
			if(i % 12 != 0) continue;
			System.out.println(i);
		}*/
		char char1 = '1';
		char char2 = '2';
		char s1 = '5';
		//System.out.println(s1 + char1);
		while(true) {
			Thread.sleep(500);
			System.out.println(new Random().nextInt(20) - 10);
		}
	}

}
