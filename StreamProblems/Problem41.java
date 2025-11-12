import java.util.*;
import java.util.stream.*;

class Problem41{
    public static void main(String[] args){
        List<Person> persons =  Arrays.asList(
            new Person("aravind", Arrays.asList("black","white")),
            new Person("bob", Arrays.asList("red","blue","green")),
            new Person("ak", Arrays.asList("orange", "red"))
        );

        List<List<String>> mapList = persons.stream().map(Person::getColor).collect(Collectors.toList());
        System.out.println(mapList);

        List<String> flatMapList = persons.stream().flatMap(x -> x.getColor().stream()).collect(Collectors.toList());
        System.out.println(flatMapList);
    }
}

class Person{
    private String name;
    private List<String> color;

    public Person(String name,  List<String> color){
        this.name = name;
        this.color = color;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setColor(List<String> color){
        this.color = color;
    }

    public List<String> getColor(){
        return this.color;
    }

}