import java.util.Scanner;

public class Brocamp {
public static void main(String[] ar) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter 2 numbers");

    int a=s.nextInt();
    int b=s.nextInt();
    s.close();
    int c=a+b;
    System.out.println("Result is:"+c);
    
}
}