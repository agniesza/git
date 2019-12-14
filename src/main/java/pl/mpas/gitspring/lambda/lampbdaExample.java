package pl.mpas.gitspring.lambda;



public class lampbdaExample {
public static void main(String[] args){
        //+
    System.out.println(performCalculations(1,2,(a, b) -> a + b));

        //*
    System.out.println(performCalculations(1,2,(a, b) -> a * b));
    System.out.println(performNic("aga", "rzysko", 22, (i, n, w) ->i+":"+n+" w wieku:"+w));
}
    private static int performCalculations(int first, int second, Calculations calculations){
return calculations.calc(first,second) ;

    }
    private static String performNic(String imie, String nazwisko, int wiek, nic nicwsumie){
    return nicwsumie.metoda(imie, nazwisko, wiek);
    }
}
