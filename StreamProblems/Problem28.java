//Remove all non-numeric values
import java.util.function.*;
import java.util.*;
import java.util.stream.*;
class Problem28{
    public static void main(String[] args){
        List<String> list = {"abc123","23dC#","3dd"};

        Pattern pattern = Pattern.complie("[^0-9]");
        List<String> newList = list.stream().map(x->pattern.matcher(x).replaceAll("")).collect(Collectors.toList());
    }
}