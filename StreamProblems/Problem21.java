import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem21{
    //Check if array elements is unique or not.
    public static void main(String[] args){
        String[] str = {"ewe","jji","jhj","kwk","aha"};

        System.out.println(Stream.of(str).collect(Collectors.groupingBy(x->x.toString().substring(1,2))));
    }
}