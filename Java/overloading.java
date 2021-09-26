

class Adder{

    static int sum(int a, int b){
        return a + b;
    }

    static double sum(double a, double b, double c){
        return a + b + c;
    }
}


class Test_Overloading{

    public static void main(String args[]){
        System.out.println(Adder.sum(10,50));
        System.out.println(Adder.sum(10,50,50));

    }
}