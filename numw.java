import java.util.*;
public class numw{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the last digit to Print: ");
        int n=sc.nextInt();
        int a=0;
        while(a<=n){
            System.out.println(a);
            a++;
        }
    }
}