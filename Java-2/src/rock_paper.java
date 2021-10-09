package rock;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


class game{

String a[] = {"Rock", "Paper", "Scissor"};
    void start(){
    System.out.println("WELCOME TO ROCK , PAPER AND SCISSORS TOURNAMENT PLAYER 1 !");
    System.out.println("Please choose one of the give option to continue with the game");
    Scanner sc = new Scanner(System.in);
    System.out.println("Rock(r) or Scissor(s) or Paper(p)");
    int ans = sc.nextInt();
    int randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
    System.out.println(a[randomNum]);

    if(a[randomNum] == a[ans] ){
        System.out.println("This looks like a tie !");
    }
    else if(a[randomNum] == "Rock" && a[ans] == "Paper" ){
        System.out.println("HOORAY!, YOU WON THE GAME");
    }
    else if(a[randomNum] == "Rock" && a[ans] == "Scissor"){
        System.out.println("Sorry, but it looks like you lost the game ;-; , please try again later");
    }
    else if(a[randomNum] == "Scissor" && a[ans] == "Paper"){
        System.out.println("Sorry, but it looks like you lost the game ;-; , please try again later");
    }
    else if(a[randomNum] == "Scissor" && a[ans] == "Rock" ){
        System.out.println("HOORAY!, YOU WON THE GAME");
    }
    else if(a[randomNum] == "Paper" && a[ans] == "Scissor" ){
        System.out.println("HOORAY!, YOU WON THE GAME");
    }
    else if(a[randomNum] == "Paper" && a[ans] == "Rock"){
        System.out.println("Sorry, but it looks like you lost the game ;-; , please try again later");
    }
    else{
        System.out.println("Hmm, it looks like an unexpected error occured , please try again later");
    }




    }

}

class caller{
    public static void main(String args[]){
        game g = new game();
        g.start();
    }
}