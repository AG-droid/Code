package atm;

import java.util.Scanner;




class atm{


    



    void home(){

        System.out.println("Welcome to HSBC banking services !");
        Scanner ask = new Scanner(System.in);
        System.out.println("What would you like to do today?");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        String service = ask.nextLine();
        if(service.equals("1")){
            withdraw();
        }
        else if(service.equals("2")){} {

            deposit();
            
        }else {
            error();

            
        }

    }

    void error(){

        System.out.println("This isn't a suitable input");
            System.out.println("Would you like to try again ? (y/n)");
            Scanner home = new Scanner(System.in);
            String confirm = home.nextLine();

            if(confirm.equals("y" )){

                home();
        
            }

    }



    void run(){

        home();
    }
}









class Caller{

    public static void main(String args[]){
        
        atm a = new atm();
        a.run();
    }
}