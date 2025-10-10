import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem23{
    //Check if array elements is unique or not.
    public static void main(String[] args){
        List<String> str = Arrays.asList("Zudio","Puma","H&M","Nike");

        List<String> sorted = str.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);
    }
}