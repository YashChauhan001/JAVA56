import java.util.*;
public class div {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String res=(a%3==0 && a%5==0)?"Number is Divisible by 3 and 5":"Number is not Divisible by 3 and 5";
        System.out.println(res);
        sc.close();
    }
}
