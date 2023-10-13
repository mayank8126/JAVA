import java.util.Scanner;
public class Voterid{
	public static void main(String [] args){
		Scanner xo = new Scanner(System.in);
		System.out.println("Enter Age -");
		int age = xo.nextInt();
		if(age<18){
			System.out.println("Underage");
		}
		else if(age>=18){
			System.out.println("Eligble");
		}
		
		}
}
		