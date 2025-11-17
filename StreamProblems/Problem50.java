class Problem50{

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1,"aravind","sekar",50000.0),
                new Employee(2, "yasin","l",45000.0),
                new Employee(3, "dhaneesh","siyambu",10000.0)
        );

//        employeeList.stream()
//                .sorted(Comparator.comparing(Employee::getFirstName)
//                        .thenComparing(Employee::getLastName))
//                .collect(Collectors.toList()).forEach(System.out::print);

        String str = "byebyebyebirdbye";
        String subStr = "bye";

        Long count = IntStream.range(0, str.length()-2)
                .filter(x-> str.substring(x, x+3).equals(subStr))
                .count();
        System.out.println(count);

        String reverse = IntStream.range(0,str.length())
                .mapToObj(x->String.valueOf(str.charAt(str.length()-1-x)))
                .collect(Collectors.joining());

        System.out.println(reverse);
    }
}