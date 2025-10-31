import java.util.function.*;
import java.util.*;
import java.util.stream.*;
import java.util.

class Problem29{

    public static void main(String[] args){
        List<String> list = {"abc123","123","3dd"};
        Pattern pattern = Pattern.complie("[^0-9]");
        int n = list.length();

        ListIterator<String> it = list.listIterator();
        Pattern pattern = Pattern.complie("[^0-9]");

        while(it.hasNext()){
            if(pattern.matcher(it.next())){
                continue;
            }
            System.out.println(it.next());
        }

        List<String> newList = list.stream().filter(x-> x.matches("\\d+")).collect(Collectors.toList());
    }

}