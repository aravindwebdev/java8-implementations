import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem40{

    public static void main(String[] args){
        List<String> arr = Arrays.asList("a","b","c","d");

        String ans = arr.stream().map(String :: toUpperCase).reduce((a,b) -> a.join(" ",a,b)).orElse("");
        String ans1 = arr.stream().map(String :: toUpperCase).reduce((a,b) -> a+" "+b).orElse("");


        System.out.println(ans1);
    }

}