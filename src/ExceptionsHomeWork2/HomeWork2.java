package ExceptionsHomeWork2;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        double [] intArray = new double[]{5.5, 4.8, 4.5, 2.4, 1.0, 6.8, 8.4, 9.9, 8.5};
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        if(Double.isInfinite(catchedRes1)) throw new ArithmeticException("На ноль делить нельзя!!!");
        else System.out.println(catchedRes1);
    }
}
