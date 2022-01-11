package day02;

public class MathAlgorithms {

    public int greatestDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return greatestDivisor(b, a % b);

    }

}
