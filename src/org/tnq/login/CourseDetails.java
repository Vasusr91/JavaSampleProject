package org.tnq.login;

public class CourseDetails extends NameList {
	public void javaCourse() {
		System.out.println("Java");
	}

	public void seleniumCource() {
		System.out.println("Selenium");
		}
	public static void main(String[] args) {
	CourseDetails course = new CourseDetails();
	course.javaCourse();
	course.seleniumCource();
	
	course.stdId();
	course.stdName();
	
	}
}
