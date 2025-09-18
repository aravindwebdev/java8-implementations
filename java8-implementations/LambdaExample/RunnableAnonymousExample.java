class RunnableAnonymousExample{
    public static void main(String[] args){
        Runnable runnable = new Runnable(){
            @Override
            public void run(){
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();
    }
}