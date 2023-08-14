import java.util.Scanner;
public class fl{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Last Number: "+n%10);
        while(n>=10){
            n=n/10;
        }
        System.out.println("First Number: "+n);
        sc.close();
    }
}