public class TypeCasting{
	public static void main(String[] args){
		// byte,short,int,long
		// Weidening Typecasting
		byte n1 = 10;
		int resut  = n1;
		float n2 = 20.32f;
		System.out.println(n2);
		//Narrowing Type Casting
		int b1 = (int)n2;
		char a = '5';
		int b = (int) a;
		char c = 'H';
		int j = c;
		System.out.println(j);
		System.out.println(a);
		System.out.println(resut);
		System.out.println(b1);
	}
}
