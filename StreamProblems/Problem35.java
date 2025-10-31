import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem35{
    //Square of  list
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> result = list.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(result);
    }

}