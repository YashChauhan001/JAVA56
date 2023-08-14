import java.util.Scanner;
public class input {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean a=sc.nextBoolean();
        int c=sc.nextInt();
        float b=sc.nextFloat();
        String d=sc.nextLine();
        long e=sc.nextLong();
        double f=sc.nextDouble();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        sc.close();
    }
}
