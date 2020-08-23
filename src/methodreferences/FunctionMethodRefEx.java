package methodreferences;

import java.util.function.Function;

public class FunctionMethodRefEx {

    static Function<String,String> toUpperLambdas = String::toUpperCase;
    static Function<String,String> toUpperMethodRef = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperLambdas.apply("java8"));
        System.out.println(toUpperMethodRef.apply("java8"));

    }
}
