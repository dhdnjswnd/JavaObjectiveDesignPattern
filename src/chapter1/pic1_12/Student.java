package chapter1.pic1_12;

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
		course.addStudent(this);
	}

	public void dropCourse(Course course) {
		if (courses.contains(course)) {
			courses.remove(course);
			course.removeStudent(this);
		}
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}
}
