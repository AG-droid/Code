package Thread_Class;


public class Thread_Class{
    public static void main(String args[]){
        Thread t = new Thread("My first thread");

        t.start();

        String str = t.getName();
        System.out.println(str);

    }
}