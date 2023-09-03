import java.util.*;
public class sumodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,sum=0;
        while(a<=n){
            if(a%2!=0)
            sum=sum+a;
            a++;
        }
        System.out.println(sum);
    }
    
}
