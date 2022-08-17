package test;




class Dino{

    void Test(){

        System.out.println("THis is a  test message ");
    }

}




class Caller{

    public static void main(String args[]){

        Dino d = new Dino();
        d.test();

    }
}