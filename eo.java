import java.util.Scanner;
public class eo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        String  ans=(a%2==0)?"Even":"Odd";
        System.out.print("Number is "+a+" "+ans);
    }
}
