import java.util.*;
public class rectanglearea {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Lenghth: ");
        int l=sc.nextInt();
        System.out.print("Enter Breadth: ");
        int b=sc.nextInt();
        int area=2*(l+b);
        System.out.println("Area of Rectangle is: "+area);
    }
}
