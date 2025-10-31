import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem31{
    //Average of given list
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Double result = list.stream().mapToDouble(Integer :: doubleValue).average().getAsDouble();
        System.out.println(result);
    }

}