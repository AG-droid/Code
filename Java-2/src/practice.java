package practice;





class Test{

    void run(){


        System.out.println("This is a test message ");

    }
}

class Caller{


    public static void main(String args[]){


        Test t = new Test();
        t.run();
    }
}