import java.util.Scanner;
public class reversed{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int a=sc.nextInt(),i,reversed=0,reminder;
        while(a!=0){
            reminder=a%10;
            reversed=reversed*10+reminder;
            a=a/10;
        }
        System.out.print(reversed);
        sc.close();
    }
}