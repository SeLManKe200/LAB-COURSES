package SQUARE_PETERSON;

import java.util.Scanner;

public class MAIN {
    
public static void main(String[] args) {
    

    int number =0;
    System.out.println("Please , enter a number");
    Scanner scan =new Scanner(System.in);
    number=scan.nextInt(); //number = new Scanner(System.in).nextInt(); //this is correct too
    SquareClass sc = new SquareClass(number);
    PetersonClass pc=new PetersonClass(number);
    if(sc.checkSquareNumber() && pc.chechPetersonNumber())
        System.out.println("The number is both SquareNumber and PetersonNumber");
    else
        System.out.println("The number is not either SquareNumber or PetersonNumber");
    


}



    
}
