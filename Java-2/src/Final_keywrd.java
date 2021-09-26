package Final;



final class test{};

class Child extends test{
    void test1(){
        System.out.println("this is a test line");
    }
}

class Bike{
    final int speed = 500;

    void run(){
        int speed = 700;

    }
}

class caller{
    public static void main(String args[]){
        Bike b = new Bike();
        Child c = new Child();
        Child.test1();
        b.run();


    }
}


