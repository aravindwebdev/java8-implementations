import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem24{

    public static void main(String[] args){
        List<Integer> num = Arrays.asList(1,2,3,4,5);

        List<Integer> square  = num.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
    }
}