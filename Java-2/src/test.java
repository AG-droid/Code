package test;



class Game{

    void ask(){
        System.out.println("Welcome to the game sir");


    }
}


class Caller{

    public static void main(String args[]){

        Game g = new Game();
        g.ask();
    }
}