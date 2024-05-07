import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //factorial number
int fact=1;
int f;
System.out.println("enter the number");
int num1=sc.nextInt();
for (f=1;f<=num1;f++) {
    fact=fact*f;
    }
}
}