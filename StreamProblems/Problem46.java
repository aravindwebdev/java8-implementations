import java.util.*;
import java.util.stream.*;

class Problem46{
    //Infinte stream

    public static void main(String[] args){
        Stream<Integer> nums = Stream.iterate(1, x->x+1);
        //nums.limit(10).forEach(System.out :: println);

        //First use Int primitive for good memory usage
        IntStream infiteIntStream = IntStream.iterate(2, x->x*2);
        infiteIntStream.limit(10).forEach(System.out :: println);

        //Usage of random
        DoubleStream doubleStream = DoubleStream.generate(Math::random);
        doubleStream.limit(10).forEach(System.out :: println);
    }
}