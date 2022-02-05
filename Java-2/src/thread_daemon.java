package thread_daemon;



class Test extends Thread{

    public void run(){

        for(int i = 0; i<7;i++){

            System.out.println("Thead 1, Output: "+ i);
        }
    }
}


class Test2 extends Thread{

    public void run(){

        for(int i=0;i<5;i++){
            System.out.println("Thread 2, Output: "+i);
        }
    }
}

class Test3 extends Thread{

    public void run(){

        for(int i=0;i<8;i++){
            System.out.println("Thread 3, Output: "+i);
        }
    }
}



class Caller{

    public static void main(String args[]){

        Test t1 = new Test();
        Test2 t2 = new Test2();
        Test3 t3 = new Test3();

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();



    }
}