package thread_prior;




class Test extends Thread{

    public void run(){
        System.out.println("This is the first thread");
    }
}

class Test2 extends Thread{

    public void run(){
        System.out.println("THis is the second thread");
    }
}

class Test3 extends Thread{
    public void run(){

        System.out.println("This is the third thread");
    }
}


class Caller{
    public static void main(String args[]){

        Test t1 = new Test();
        Test2 t2 = new Test2();
        Test3 t3 = new Test3();

        t1.setPriority(1);
        t2.setPriority(6);
        t3.setPriority(9);
        t1.start();
        t2.start();
        t3.start();
    }
}