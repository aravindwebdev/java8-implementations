import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem36{
    public static void main(String[] args){
        List<Person> persons = createPersonList();

        // List to Map<city, person>

       persons.stream().collect(Collectors.groupingBy(Person :: getCity))
        .forEach((k,v)-> System.out.println(k+" "+v));
    }

    private static List<Person> createPersonList(){
        Person person1 = new Person("aravind", 25, "chennai");
        Person person2 = new Person("kumar", 22, "chennai");
        Person person3 = new Person("sekar",54, "chengalpattu");

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
    
        return persons;
    }
}

class Person{
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getCity(){
        return this.city;
    }

}