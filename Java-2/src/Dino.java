package Dino;


import java.util.Scanner;

class Game{

    class Character{



        void Inpt(){


            Scanner myObj = new Scanner(System.in);
            System.out.println("PLEASE WRITE THE NAME OF YOUR DINOSAU");
            String inpt1 = myObj.next();


        }
    }

    void run(){
        System.out.println("WELCOME TO THE DINO ADVENTURE GAME !!!!");
        Character c = new Character();
        c.Inpt();
    }

}

class Caller{
    public static void main(String args[]){
        Game g = new Game();
        g.run();


    }
}