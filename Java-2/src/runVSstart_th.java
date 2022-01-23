package runVSstart;





class Test extends Thread{

   public void run(){

       for(int i=0;i<5;i++){

           try{
               Thread.sleep(500);
           }catch (InterruptedException e){
               System.out.println(e);
           }
           System.out.println(i);
       }
    }
}

class Caller{
    public static void main(String args[]){

        Test t1 = new Test();
        Test t2 = new Test();

        t1.run();
        t2.run();
//The main difference over here that can be seen is that with the help of run only the first stack completes itself whereas with the start the whole stack runs together
        t1.start();
        t2.start();
    }
}