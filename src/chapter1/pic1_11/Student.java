package chapter1.pic1_11;

import java.util.ArrayList;

public class Student {
	private String name;
	private ArrayList<Course> courses;

	public Student(String name) {
		this.name = name;
		courses = new ArrayList<>();
	}

	public void registerCourse(Course course) {
		courses.add(course);
	}

	public void dropCourse(Course course) {
		if (courses.contains(course))
			courses.remove(course);
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}
}
