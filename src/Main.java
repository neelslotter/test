import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        doLoop(1, 1000);


    }

    private static void doLoop(int aMin, int aMax) {
        for (int x = aMin; x < aMax; x++) {
            System.out.println("Hello World ! " + x);
        }

        for (int x = aMin; x < 10; x++) System.out.println("Hello World ! " + x);

        IntStream.range(aMin, aMax).mapToObj(x -> "Hello World !" + x).forEach(System.out::println);

        IntStream.range(aMin, aMax).mapToObj(x -> "Hello World !" + x).forEachOrdered(System.out::println);

        int x = 0;
        while (x < aMax) {
            System.out.println("Hello World !" + x);
            x++;
        }

        int x1;
        for (x1 = 0; x1 < aMax; x1++) {
            System.out.println("Hello World !" + x1);
        }

        int y;
        for (y = aMax; y != 5; y--) System.out.println("Hello World !" + y);

        int k;
        for (k = aMax; k != 5; k--) System.out.println("Hello World ! k " + k);


    }
}
