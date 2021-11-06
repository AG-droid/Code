package Replace_All;



class Replacement{

    void run(){

        String s1 = "My name is John";
        System.out.println(s1);
        s1 = s1.replace("John", "Rakesh");
        System.out.println(s1);
    }
}



class Caller{
    public static void main(String args[]){

        Replacement r = new Replacement();
        r.run();
    }
}