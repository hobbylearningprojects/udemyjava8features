package functionalinterfaces;

import java.util.function.Function;

public class FunctionEx {

    static Function<String,String> function = (name) -> name.toUpperCase();
    static  Function<String,String> addString = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println( "result : "+ function.apply("java8"));
        System.out.println( "result concat : "+ function.andThen(addString).apply("java8"));
        System.out.println( "result compose : "+ function.compose(addString).apply("java8"));


    }
}
