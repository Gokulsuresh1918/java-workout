import java.util.Scanner;

public class Samble2 {
    public static void main(String ar[]) {

        System.out.println("Enter 2 numbers");
        Scanner value=new Scanner(System.in);
        int a=value.nextInt();
        int b=value.nextInt();
        value.close();

        int num1=200;
        int num2=400;
         
        Sum s=new Sum();

        Sum s1=new Sum();

        s.calculationSum(a,b);
        s.displaySum( );
        
        s1.calculationSum(num1, num2);
        s1.displaySum();

        s.displaySum();
        
    }
    
}
