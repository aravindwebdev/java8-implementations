import java.util.*;
import java.util.stream.*;

class Problem41{
    //concatenate two strings

    public static void main(String[] args){
        Stream<String> stream1 = Stream.of("Java", "Python");
        Stream<String> stream2 = Stream.of("C", "C++");
        Stream<String> concatedString = Stream.concat(stream1, stream2);
        concatedString.forEach(System.out::println);
    }
}