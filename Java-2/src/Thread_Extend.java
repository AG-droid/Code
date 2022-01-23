package Thread_Extend;



class Multi extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
}

class Caller{

    public static void main(String args[]){
        Multi t1 = new Multi();
        t1.start();
        //A Thread cannot start twice, thus the code above this will show an error during it's execution
        t1.start();
    }
}