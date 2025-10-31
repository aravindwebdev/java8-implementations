import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem39{

    public static void main(String[] args){
        List<Integer> arr = Arrays.asList(1,2,3,4,5);

        Integer ans = arr.stream().reduce( (a,b) -> a*b).get();

        System.out.println(ans);
    }

}