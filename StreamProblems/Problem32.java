import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem31{
    //Intersection of two list
    public static void main(String[] args){
        List<Integer> list1 = Arrays.asList(1,2,3,4,5);
        List<Integer> list2 = Arrays.asList(3,4,5,6,7);

        List<Integer> result = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(result);
    }

}