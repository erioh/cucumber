package tester;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStreams {
    public static void main(String[] args) {
        System.out.println(f(6));

        System.out.println(IntStream.rangeClosed(2, 6).reduce(1, (x, y) -> x * y));
    }

    public static int f(int i) {
        int res = 1;
        for (int j = 2; j <= i; j++) {
            res = res*j;
        }
        return res;
    }
}
