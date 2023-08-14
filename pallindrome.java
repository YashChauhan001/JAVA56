import java.util.Scanner;
public class pallindrome{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int a=sc.nextInt(),i,reversed=0,reminder;
        int z=a;
        while(a!=0){
            reminder=a%10;
            reversed=reversed*10+reminder;
            a=a/10;
        }
        sc.close();
        if(reversed==z)
        System.out.print("Pallindrome Number");
        else
        System.out.print("Not Pallindrome");
    }
}