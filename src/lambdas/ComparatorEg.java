package lambdas;

import java.util.Comparator;

public class ComparatorEg {

    public static void main(String[] args) {
        Comparator comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("comparator results :" + comparator.compare(10,10));

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("comparator lambda results :" + comparatorLambda.compare(1001,100));

        Comparator<Integer> comparatorLambda1 = (a,b)-> a.compareTo(b);

        System.out.println("comparator lambda1 results :" + comparatorLambda1.compare(1000,1001));


    }

}
