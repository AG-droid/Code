package final_test;




final class Parent{}



class Child extends Parent{

    void Func(){
        System.out.println("This line cannot be run, bcz ");
    }
}

class Caller{
    public static void main(String args[]){
        Child c = new Child();
        c.Func();
    }
}

