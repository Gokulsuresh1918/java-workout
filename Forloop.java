import java.util.Scanner;

public class  Forloop {
        public static void main(String []ar){
             Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers");
        int num=sc.nextInt();
        sc.close();
    int sum=0;
    for(int i=0;i<=num;i++){
        sum=sum+i;
    }
    System.out.println("Result :"+sum);
}
}
