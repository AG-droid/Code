package Concat;




class Concatation{

    void run(){

        String s1 = "Hello there ";
        s1.concat("Mr.Doe");
        System.out.println(s1);
        s1 = s1.concat("Mr. Doe");
        System.out.println(s1);
    }
}



class Caller{
    public static void main(String args[]){


        Concatation c = new Concatation();
        c.run();

    }
}