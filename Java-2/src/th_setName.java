package th_setName;


class Test extends Thread{

    public void run(){
        System.out.println("The thread is running....");
    }
}


class Caller{
    public static void main(String args[]){

        Test t1 = new Test();
        Test t2 = new Test();

        String name1 = t1.getName();
        String name2 = t2.getName();
        System.out.println("Name of t1: "+name1);
        System.out.println("Name of t2: "+name2);


        t1.setName("Thread 1.0");
        System.out.println("The new name of t1 is "+t1.getName());
    }
}