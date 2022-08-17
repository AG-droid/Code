package functions;





// Function are a group of programs that can be run whenever required by the user or the system.



class Test{

    //in java functions are created with the help of the void method

    void run(){

        int a = 20;
        int b = 40;
        int c = a +b;

        System.out.println("The sum of a and b is "+ c );
    }
}




class Caller{


    public static void main(String args[]){


        Test t = new Test();

        t.run();
    }
}