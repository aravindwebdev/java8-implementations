import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem24{

    public static void main(String[] args){
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,8,9,10);

        List<Integer> square  = num.stream().distinct().filter(x->x%2!=0).collect(Collectors.toList());
        System.out.println(square);
    }
}