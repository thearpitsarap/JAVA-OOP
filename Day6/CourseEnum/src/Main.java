import java.util.Scanner;
import java.text.ParseException;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter name : ");
			String name = sc.nextLine();

			System.out.println("Enter Birth Date in dd/MM/yyyy format : ");
			String date1 = sc.nextLine();
			Date date = DateUtils.getDate(date1);

			System.out.println("Enter Course Name in VLSI, DAC, DESD: ");
			String course = sc.nextLine();
			CourseEnum ce = CourseEnum.valueOf(course);

			Student s = new Student(name, ce, date);
			System.out.println(s);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}