package Thread_run_class;


public class Thread_run_class implements Runnable{
public void run(){
    System.out.println("Now the the thread is running ......");
}

}

class Caller{
    public static void main(String args[]){

        Runnable r1 = new Thread_run_class();
        Thread th1 = new Thread(r1,"My new thread");



        th1.start();

        String s1 = th1.getName();
        System.out.println(s1);
    }
}