package school.mjc.stage0.module3.task4;

import static java.lang.Math.pow;

public class FormulaCreator {
    public static void main(String[] args) {
    char A = 1;
    char B = 1;


        double v = ((((9 * pow(A, 2)) - (5 * B)) + 2 + A) - 7) * ((double) ((A + B) - (4 * A * B)) / 2);

        System.out.println(v);
    }
}
