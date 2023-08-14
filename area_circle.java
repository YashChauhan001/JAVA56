import java.util.Scanner;
public class area_circle {
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Radius: ");
    int a=sc.nextInt();
    double area=3.14*(a*a);
    sc.close();
    System.out.println("Aera of circle is: "+area);
   } 
}
