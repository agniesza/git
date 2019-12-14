package pl.mpas.gitspring.lambda;



public class lampbdaExample {
public static void main(String[] args){

    System.out.println(performCalculations(1,2,));
}
    private static int performCalculations(int first, int second, Calculations calculations){
return calculations.calc(first,second) ;
    }
}
