package grabage_collect;



class Test{

    public void finalize(){
        System.out.println("object is garbage collected");
    }
}


class Caller{

    public static void main(String args[]){

        Test t1= new Test();
        Test t2 = new Test();

        t1 = null;
        t2 = null;
        System.gc();

    }
}