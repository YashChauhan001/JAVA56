import java.util.*;
public class fact {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i;
        int fact=1;
        for(i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.print("FActorial is: "+fact);
        sc.close();
    }
}
