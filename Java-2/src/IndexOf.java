package index;



class Index{
    void run(){

        String s1 = "Hello u";
        int ind = s1.indexOf("u");
        System.out.println(ind);
    }
}



class Caller{

    public static void main(String args[]){

        Index i = new Index();
        i.run();
    }
}