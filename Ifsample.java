import java.util.Scanner;

public class Ifsample {
    public static void main(String a[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num=sc.nextInt();
        int num1=sc.nextInt();
        sc.close();
        int c;
        c=num+num1;
        System.out.println("Entered numbers sum is :"+c);

        if(c<0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is positive");
        }
    }
}
