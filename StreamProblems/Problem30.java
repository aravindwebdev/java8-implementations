import java.util.function.*;
import java.util.*;
import java.util.stream.*;
import java.util.

class Problem30{
    public static void main(String[] args){
        List<String> list = Arrays.asList("breaking bad","leo","dass");

        list.stream().map(String::toUpperCase).collect(Collector.toList());   
    }

}