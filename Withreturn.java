import java.util.Scanner;

public class Withreturn {
    public static void main(String []ar) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
       
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int result=sum(a,b);
        System.out.println("sum is:"+result);

        
    }
    static int sum(int a,int b){
    int s=a+b;
    return s;
    }
}
