package Abstract;


abstract class Value{
    abstract void sum();
}


class Val1 extends Value{
    void sum(){
        int a = 64;
        int d = a + 5;
        System.out.println(d);
    }
}

class Val2 extends Value{

    void sum(){
        System.out.println("The real sum of numbers is taking place in the backend of this code");
    }
}

class caller{
    public static void main(String args[]){

        Value v = new Val2();
        v.sum();
    }
}