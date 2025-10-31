import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem37{
    //Square of  list
    public static void main(String[] args){
        List<String> fruits = Arrays.asList("Apple", "Orange", "Avocado");

        Map<Character, Long> ansMap = fruits.stream().collect(
            Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));

        System.out.println(ansMap);
    }

}