import java.util.Scanner;
public class Fact{
	public static int fact(int n){
		if(n==1){
			return n;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args){
		System.out.println("Enter the NUm-");
		Scanner xo = new Scanner(System.in);
		int n = xo.nextInt();
		System.out.println(fact(n));
	}
}
		
