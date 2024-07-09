package task4;

import java.util.stream.Stream;

public class StreamRandomNumbers {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (1L << 48); // 2^48

        long seed = System.currentTimeMillis();

        Stream<Long> randomStream = generateRandomStream(a, c, m, seed);

        randomStream.limit(8).forEach(System.out::println);
    }

    public static Stream<Long> generateRandomStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }
}
