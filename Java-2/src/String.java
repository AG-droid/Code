package string;



class Imutable{

    void test(){
        String s = " This is an immutable string";
        s.concat(" Let's see if this is true");
        System.out.println(s);
    }


}


class Mutable{
    void test(){
        String s = "This string can be muted by ";
        s = s.concat("Declaring the appendation ");
        System.out.println(s);
    }
}


class Compare{
    void test(){

        String s1 = "123456";
        String s2 = "123456";
        String s3 = "123";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s1));
        System.out.println(s1.compareTo(s3));


    }

}


class Caller{
    public static void main(String args[]){

        Imutable I = new Imutable();
        Mutable M = new Mutable();
        Compare C = new Compare();
        I.test();
        M.test();
        C.test();
    }
}