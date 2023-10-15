import java.util.Scanner;
public class Student{
	public static void main(String [] agrs){
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter your name - ");
		String name = myobj.nextLine();
		System.out.println("Enter your age - ");
		int age = myobj.nextInt();
		System.out.println(age);
	}
}
		