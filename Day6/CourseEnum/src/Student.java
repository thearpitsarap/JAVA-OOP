import java.util.Date;

public class Student {
	
	private String name;
	private static int rollnoGenerator=1;
	private int rollno;
	private CourseEnum course;
	private Date birthDate;
	
	Student(String n,CourseEnum c, Date d){
		this.name = n;
		this.course = c;
		this.birthDate = d;
		this.rollno = rollnoGenerator++;
	}
	
	@Override
	public String toString() {
		return "name : " + name + " roll : " + rollno + " Course : " + course.getValue() + " Birthdate : " + birthDate;
 	}
}