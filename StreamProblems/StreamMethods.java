import java.util.*;
import java.util.stream.*;

class StreamMethods{
    public static void main(String args[]){
        List<String> names = Arrays.asList("Aravind","Bala","Catherine","Dharma","Ankita","Aravind");
        List<List<String>> namesList = Arrays.asList(
            Arrays.asList("Aravind","Bala","Catherine","Dharma","Ankita"),
            Arrays.asList("Bike","Scooter","Car","Car","Scooter")
        );
        //1. stream()
        Stream<String> stream = names.stream();
        System.out.println(stream);
        //2. filter()
        List<String> filterNames = names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        filterNames.forEach(System.out :: println);

        //3. Map()
        List<Integer> filteredMap = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(filteredMap);

        //4. flatMap()
        namesList.stream().flatMap(Collection::stream).collect(Collectors.toList());

        //5. forEach()
        //namesList.stream().flatMap(Collection::stream).collect(Collectors.toList()).forEach(System.out::println);

        //6. collect()
        //namesList.stream().flatMap(Collection::stream).collect(Collectors.toList()).forEach(System.out::println);

        //7. sort()
        Stream<String> sortedList = names.stream().sorted();
        sortedList.limit(1).forEach(System.out::println);

        //8. duplicate()
        names.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);

        //9. skip()
        names.stream().distinct().skip(1).collect(Collectors.toList()).forEach(System.out::println);

        //10. peek()
        names
            .stream().peek(e -> System.out.println("Original stream: "+e))
            .distinct().peek(e -> System.out.println("Distinct stream: "+e))
            .map(String::toLowerCase).peek(e -> System.out.println("LowerCase stream: "+e))
            .filter(x->x.startsWith("b")).collect(Collectors.toList());

        
        //11. count()
        Long count = names.stream().count();
        System.out.println(count);

        //12. AllMatch()
        List<String> namesList1 = Arrays.asList("Aravind","KK","Ankit");
        Boolean result = namesList1.stream().allMatch(x -> x.startsWith("A"));
        System.out.println(result);

        //13. AnyMatch()
        Boolean result1 = namesList1.stream().anyMatch(x -> x.startsWith("A"));
        System.out.println(result1);

        //14. NoneMatch()

        Boolean result2 = namesList1.stream().noneMatch(x -> x.startsWith("A"));
        System.out.println(result2);




    }
}