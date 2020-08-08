package intro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeEg2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 4, 5, 5, 6, 7, 7, 8, 9, 9);

        List<Integer> uniqueList = integerList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueList);


    }

    
}
