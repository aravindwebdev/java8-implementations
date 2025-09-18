class RunnableAnonymousExample{
    public static void main(String[] args){
        // Using java 8 lamdba function
        // ()->{}
        Runnable runnable = ()-> System.out.println("Inside Runnable 2");
        new Thread(runnable).start();

        //or
        new Thread(()->System.out.println("Inside Runnable 3")).start();
    }
}