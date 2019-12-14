package pl.mpas.gitspring.lambda;

@FunctionalInterface
public interface Calculations {
    int calc(int a, int b);
   default void calc2() {}
}
