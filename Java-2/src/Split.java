package Split;



class Splitter{
    void run(){

        String s1 = "This,is,a,test,line";

        String[] arr = s1.split(",",0);

        for(String i:arr){

            System.out.println(i);
        }
    }

        }




class Caller{
    public static void main(String args[]){

        Splitter s = new Splitter();

        s.run();

    }
}