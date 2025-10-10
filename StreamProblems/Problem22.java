import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem22{
    //Check if array elements is unique or not.
    public static void main(String[] args){
        List<Integer> num = Arrays.asList(1,2,3,4,5);

        int sum = num.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}