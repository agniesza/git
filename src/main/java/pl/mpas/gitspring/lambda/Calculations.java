package pl.mpas.gitspring.lambda;

public interface Calculations {
    int calc(int a, int b);
   default void calc2() {}
}
