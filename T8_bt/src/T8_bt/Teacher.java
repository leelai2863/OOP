package T8_bt;

import java.util.Arrays;

public class Teacher extends Person {
	private int numCourses = 0;
	private String[] courses = new String[0];


	public Teacher(String name, String address) {
		super(name, address);
	}
	public boolean addCourse(String course) {
		for(int i = 0; i < courses.length; i++) {
			if(courses[i] == course)
				return false;
		}
		String indexC[] = new String[courses.length+1];
		for(int i = 0; i < courses.length; i++) {
			indexC[i] = courses[i];
		}
		indexC[courses.length] = course;
		courses = indexC;
		numCourses ++;
		return true;
	}
	public void printCourse() {
		System.out.println(Arrays.toString(this.courses) + ", " + numCourses);
	}
	public boolean removeCourse(String course) {
		if(courses.length == 0)
			return false;
		for(int i = 0; i < courses.length; i++) {
			if(courses[i] == course) {
				String[] indexC = new String[courses.length-1];
				for(int j = 0, k = 0; j < courses.length; j++) {
					if(k == i)
						k = k + 1;
					indexC[j] = courses[k++];
				}
				courses = indexC;
			}	
		}
		numCourses --;
		return true;
	}
	public String toString() {
		return "Teacher: " + name + "(" + address + ")";
	}
	
}
