package Toss;


import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Game{

    String ans;

    String a[] = {"H", "T"};

      void Ask(){
        Scanner myObj = new Scanner(System.in);
        System.out.println(" CHOOSE HEADS OR TAILS ?!?!");
        String inpt1 = myObj.next();
        String inpt = inpt1.toLowerCase();

        if(inpt.equals("heads")){
           ans = a[0];



        }
        else if(inpt.equals("tails")){
             ans = a[1];
        }
        else{
            System.out.println("Hmm, looks like something went wrong.");
            Scanner myObj2 = new Scanner(System.in);
            System.out.println(" Do you wish to restart? (y/n)");
            String ask2 = myObj2.next();
            if (ask2.equals("y")){
                Ask();
            }
            else{
                return;
            }


        }


    }


    void win(){
        System.out.println("HOORRAY, CONGRATS , YOU JUST WON THE TOSS :) ");
    }
    void lose(){
        System.out.println("Awww, it sadly looks like that you lost the toss ;-;");
    }

    void decide(){
        int randomNum = ThreadLocalRandom.current().nextInt(0, 1 + 1);

       if(ans.equals(a[randomNum])){
           win();


       }
       else{
           lose();
       }
    }

}



class Caller{
    public static void main(String args[]){
        String ask;

        ask = "y";
        while (ask.equals("y")){

        Game g = new Game();
        g.Ask();
        g.decide();
        Scanner myObj2 = new Scanner(System.in);
        System.out.println(" Do you wish to restart? (y/n)");
         ask = myObj2.next();


    }}
}