import java.util.*;
import java.util.stream.Collectors;

class Problem20{
    //Check if array elements is unique or not.
    public static void main(String[] args){
        int[] arr = {5,0,1,0,8,0};

        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
            boolean isUnique = arrList.stream()
                .collect(Collectors.groupingBy(x->x, Collectors.counting())).values()
                .stream().noneMatch(x-> x>1);
            System.out.print(isUnique);
    }
}