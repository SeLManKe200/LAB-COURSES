package SQUARE_PETERSON;

public class SquareClass {
    int number;
    Double result;
    SquareClass(int number){
        this.number=number;

    }


   public Boolean checkSquareNumber(){
       for (int i = 0; i < number; i++) {
           if(number==(i*i))
                return true;

       }
    return false;


    }
    
}
