
package atm;

import java.util.Scanner;


class ATM{
    float amt = 1000;


    void request(){

        Scanner ask = new Scanner(System.in);
        System.out.println("Would you like to return back to the homepage? (y/n)");
        String confirm = ask.nextLine();
        if(confirm.equals("y")){
            home();
        }

    }
    void home(){

        System.out.println("WELCOME TO SBS ATM SERVICES");
        Scanner ask = new Scanner(System.in);
        System.out.println("What would you like to do today?");
        System.out.println("1.Withdraw");
        System.out.println("2. Deposit");
        String service = ask.nextLine();
        if(service.equals("Withdraw")){

            withdraw();
        }else if(service.equals("Deposit")){
            deposit();
        }else{
            System.out.println("That isn't a suitable input, please try again");
            Scanner myObj = new Scanner(System.in);
            System.out.println("Would you like to try again? (y/n)");
            String ask1 = myObj.nextLine();
            if(ask1.equals("y")){
                home();
            }

        }
    }

    void balance(){

        System.out.println("Current balance: " + amt);
    }

    void deposit(){
        System.out.println("Welcome to the SBS banking deposit systems :)");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the amount you would like to deposit.");
        float dep = myObj.nextInt();
        System.out.println("The total amount of "+ dep + " has been succesfully deposited into your account !");
        balance();
        request();





    }

    void withdraw(){

        System.out.println("Welcome to the SBS banking withdrawel systems ");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the amount you would like to withdraw from your account");
        float with = myObj.nextInt();

        if(with <= amt){
            amt -= with;
            System.out.println("The sum of $" + with + " has been successfully withdrawn from you account");
            balance();
        }else{
            System.out.println("Uh Oh, Looks like your don't have the sufficient funds at the moment");
            Scanner ask = new Scanner(System.in);
            System.out.println("Would you like to deposit some amount in your account?");
            String confirm = ask.nextLine();
            if(confirm.equals("Yes")){
                deposit();
            }

        }
        request();
    }
}






class Caller{

    public static void main(String args[]){
        ATM a = new ATM();
        a.home();




    }
}