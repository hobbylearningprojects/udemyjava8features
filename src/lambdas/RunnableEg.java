package lambdas;

public class RunnableEg {

    public static void main(String[] args) {

        // Prior java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };
        new Thread(runnable).start();


        // java 8 lambda way

        Runnable runnableLambda = () -> {
            System.out.println("Inside runnableLambda");
            System.out.println("Inside runnableLambda");
        };

        Runnable runnableLambda1 = ()->System.out.println("Inside runnableLambda1");

        new Thread(runnableLambda).start();
        new Thread(runnableLambda1).start();
        new Thread(()-> System.out.println("Inside runnableLambda2")).start();
    }
}
