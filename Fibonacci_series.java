import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

		int a=0,b=1,c;
		System.out.println("enter the number");
		int num =sc.nextInt();
		for(int i=1;i<=num;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
    }
}
}