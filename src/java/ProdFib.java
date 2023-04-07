/**
 * https://www.codewars.com/kata/5541f58a944b85ce6d00006a
 */
public class ProdFib {

    public static long[] productFib(long prod) {
        long fn = 0;
        long fnPlus1 = 1;
        long temp;
        while (fn * fnPlus1 < prod) {
            temp = fn;
            fn = fnPlus1;
            fnPlus1 = fnPlus1 + temp;
        }
        long isAccurate = 0;
        if (fn * fnPlus1 == prod) {
            isAccurate = 1;
        }
        return new long[] {fn, fnPlus1, isAccurate};
    }
}