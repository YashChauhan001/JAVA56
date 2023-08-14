import java.util.*;
public class gerat {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=(a>b)?a:b;
        System.out.print("The Greatest Number is: "+res);
        sc.close();
    }
}
