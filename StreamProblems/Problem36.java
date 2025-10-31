import java.util.function.*;
import java.util.*;
import java.util.stream.*;

class Problem36{
    public static void main(String[] args){
        List<Person> persons = Arrays.asList(
            new Person("aravind", 25), 
            new Person("kumar", 22),
            new Person("sekar",54));

        Collector<Person,StringJoiner,String> personCollector = Collector.of(
            () -> new StringJoiner(" | "),
            (j,p) -> j.add(p.getName().toString().toUpperCase()),
            (j1, j2) -> j1.merge(j2),
            StringJoiner :: toString
        );

        String result = persons.stream().collect(personCollector);
        System.out.println(result);
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
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

}