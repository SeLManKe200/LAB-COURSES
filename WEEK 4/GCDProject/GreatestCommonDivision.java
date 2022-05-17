package GCDProject;
public class GreatestCommonDivision {

    private Integer a,b;
    private int result=1;

    
    
    GreatestCommonDivision (Integer a,Integer b){

        this.a=a;
        this.b=b;

    }
    public void findGCD(){
for (int i = 1; i<=a && i<=b; i++) {// a=8 b=12
    
    if(a%i==0 && b%i==0)
        result=i;
    
}
    System.out.println("GCD of the "+a +" and"+b+" = "+result);
    }

    
    

    
}
