package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateEx {

    static Predicate<Integer> p = (i) -> {
        return i % 2 == 0;
    };
    static Predicate<Integer> p1 = (i) -> i % 2 == 0;
    static Predicate<Integer> p2 = (i) -> i % 5 == 0;

    public static void main(String[] args) {


        System.out.println(p.test(500));


        System.out.println(p1.test(500));

        System.out.println(p1.and(p2).test(504));

        System.out.println(p1.or(p2).test(509));

        System.out.println(p1.or(p2).negate().test(510));


    }
}
