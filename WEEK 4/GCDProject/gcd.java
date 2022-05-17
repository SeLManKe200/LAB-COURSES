package GCDProject;
import java.util.Scanner;
public class gcd {
    
    public static void main(String[] args) {
 
        Integer a,b;
        System.out.println("Please ,enter new 2 values as integer");
        Scanner scan =new Scanner(System.in);
        a=scan.nextInt();
        b=scan.nextInt();
        
        GreatestCommonDivision GCD =new GreatestCommonDivision(a, b);
        GCD.findGCD();


        
    }
    
}
