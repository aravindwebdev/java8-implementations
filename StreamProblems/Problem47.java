import java.util.*;
import java.util.stream.*;

class Problem47 {
    public static void main(String[] args){
        List<Employee> employeeList = Arrays.asList(
            new Employee(1, "aravind", 18, "male"),
            new Employee(2, "anika", 16, "female"),
            new Employee(3, "varun", 20, "male")
        );
        System.out.println(employeeList.stream().collect(Collectors.
                groupingBy(Employee :: getGender, Collectors.averagingInt(Employee :: getAge))));
    }
}

class Employee {
    private int id;
    private String name;
    private int age;
    private String gender;

    public Employee(int id, String name, int age, String gender){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

}