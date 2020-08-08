package intro;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeEg1 {

    public static  void main(String[] args) {
        int sum = IntStream.rangeClosed(0,100).sum();
        System.out.println("sum of 100 nums : " + sum);
    }
}
