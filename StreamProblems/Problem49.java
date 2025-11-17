class Problem49{
    public static void main(String[] args){
        int[] arr = {12, 32, 11, 46, 67, 121, 121, 56, 78, 114, 564, 1643, 11};

        Arrays.stream(arr)
            .filter(x->String.valueOf(x).startsWith("1"))
            .boxed()
                .sorted((x,y)->y-x)
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
}