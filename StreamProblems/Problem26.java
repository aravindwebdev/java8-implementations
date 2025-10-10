import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem26{

    public static void main(String[] args){
        List<Integer> num1 = Arrays.asList(1,2,3,4,5);
        List<Integer> num2 = Arrays.asList(6,7,8,8,9,10);

        List<Integer> square  = Stream.concat(num1.stream(), num2.stream()).collect(Collectors.toList());
        System.out.println(square);
    }
}