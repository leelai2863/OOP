package T8_bt;

import java.util.Arrays;

public class Student extends Person{
	private int numCourses = 0;
	private String[] courses = new String[0];
	private int[] grades = new int[0];
	
	public Student(String name, String address) {
		super(name, address);
	}
//	@Override
//	public String toString() {
//		return "Student [numCourses=" + numCourses + ", courses=" + Arrays.toString(courses) + ", grades="
//				+ Arrays.toString(grades) + "]";
//	}

	public void addCourseGrade(String course, int grade) {
		//coppy du lieu vao 1 bien tam khac de tang 1 cai code 
		String indexC[] = new String[courses.length + 1];
		for(int i = 0; i < courses.length; i++) {
			indexC[i] = this.courses[i];
		}
		indexC[course.length()] = course;
		courses = indexC;
		int indexG[] = new int[grades.length + 1];
		for(int i = 0; i < grades.length; i++) {
			indexG[i] = grades[i];
		}
		indexG[grades.length] = grade;
		grades = indexG;
		numCourses ++;
	}
	public void printGrades() {
		for(int i = 0; i < grades.length; i++) {
			System.out.println(this.grades[i]);
		}
	}
	public double getAverageGrade() {
		double sum = 0;
		for(int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];
		}
		return sum/numCourses;
	}
	public String toString() {
		return "Student " + super.toString();
	}
}
