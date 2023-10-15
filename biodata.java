import java.util.Scanner;
public class Biodata{
	public static void main(String [] args){
		Scanner xo= new Scanner(System.in);
		System.out.println("Enter Your name sir -");
		String name=xo.nextLine();
		System.out.println("Enter Your age sir -");
		int age = xo.nextInt();
		System.out.println("Enter Your adhaarchard number also sir -");
		double Adhar = xo.nextDouble();
		System.out.println("Sir your name is - "+name+" Your age is -"+age+" And Your adhaarchard number is - "+Adhar);
	}
}
