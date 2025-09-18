import java.util.Comparator;
class ComparatorLambdaExample{
    public static void main(String[] args){
        /**
         * prior java 8
         * Using Anonymous class
         */
        Comparator<Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o1.compareTo(o2); 
                // both values equal return 0 o1==o2
                // o1>o2 return 1
                // o1<o2 return -1
            }
        };

        System.out.println("Anonyous: Result of the comparator is: " + comparator.compare(2,2));

        /**
         * Using java 8
         * Lambda function
         */
        Comparator<Integer> comparatorLambda = (o1,o2) -> o1.compareTo(o2);
        System.out.println("Lambda: Result of the comparator is: "+comparatorLambda.compare(0,2));
    }
}