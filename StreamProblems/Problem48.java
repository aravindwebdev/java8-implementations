import java.util.*;
import java.util.stream.*;
import java.util.IntStream.*;


class Problem47 {
    public static void main(String[] args){
        String s = "education";
        char[] characters = s.toCharArray();
        int len = characters.length;
        int mid = len / 2;

        System.out.println(characters[mid]);

        String midCharacter = IntStream(0,len)
            .filter(x->len%2==0 ? (x==mid || x==mid-1) : x==mid)
            .mapToObj(s::charAt)
            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
            .toString();
        System.out.println(midCharacter);

    }
}