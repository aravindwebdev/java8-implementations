import java.util.*;
import java.util.stream.*;

class Problem43{
    public static void main(String[] args){
        List<Person> persons =  Arrays.asList(
            new Person("aravind", 25),
            new Person("bob", 24),
            new Person("ak", 30),
            new Person("aravind", 25)
        );

        //Bad pratice
        List<String> result = persons.stream()
            .filter(person -> person.getAge() >= 25)
            .map(Person::getName)
            .distinct()
            .sorted()
            .collect(Collectors.toList());

        //Good pratice
        List<String> filteredNames = persons.stream()
            .filter(person -> person.getAge() >= 25)
            .map(Person :: getName)
            .collect(Collectors.toList());
        
        List<String> uniqueSortedNames = filteredNames.stream()
            .distinct()
            .sorted()
            .collect(Collectors.toList());


        System.out.println(uniqueSortedNames);

    }
}

class Person{
    private String name;
    private int age;

    public Person(String name,  int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

}