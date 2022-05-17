package SQUARE_PETERSON;

public class PetersonClass {
    
    Integer number;
    PetersonClass(int number){
    this.number=number;


    }

    public int fact(String a){
        int result=1;
        int b= Integer.valueOf(a);
        for (int i = 1; i <=b; i++) { 
            result*=i; 
        }
        return result;
    }

    public boolean chechPetersonNumber(){
        int result=0;
        String str = String.valueOf(number);
        for (int i = 0; i < str.length(); i++) {
            result+=fact(String.valueOf(str.charAt(i))); 
        }
        if(result==number)
            return true;
    

        return false;
    }
}
