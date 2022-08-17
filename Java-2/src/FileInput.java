package FileInput;


import java.io.FileInputStream;

class Input{


    void character(){

        try{

            FileInputStream fin = new FileInputStream("testout.txt");
            int i = fin.read();
            System.out.println(i);
//            System.out.println((char)i);

            fin.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }

    // continue from over here.
}





class Caller{

    public static void main(String args[]){

        Input i = new Input();
        i.character();



    }
}