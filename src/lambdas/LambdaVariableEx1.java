package lambdas;

import java.util.function.Consumer;

public class LambdaVariableEx1 {

    static  int k = 0;

    public static void main(String[] args) {
        int i = 9;

        Consumer<Integer> c =(i1) ->{
            //i = 90;
            k++;
            System.out.println(i1+i+k);
        };

        c.accept(100);
    }
}
