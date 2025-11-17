import java.util.*;
import java.util.stream.*;
class Problem45{
    public static void main(String args[]){
        List<String> names = Arrays.asList("Aravind","Bala","AK");
        List<String> result = names.stream()
            .map(String :: toLowerCase)
            .filter(x -> x.charAt(0) == 'a')
            .collect(Collectors.toList());
        System.out.println(result);
    }

}