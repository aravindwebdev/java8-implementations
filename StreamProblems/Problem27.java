import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem27{

    public static void main(String[] args){
        List<Integer> num = Arrays.asList(5,3,2,1,2,3,4,5);
        int k = 3;

        int res = num.stream().sorted().skip(k-1).findFirst().get();
        System.out.println(res);
    }
}