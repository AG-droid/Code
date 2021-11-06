package Empty;


import java.util.Scanner;

class Checker{

    void run(){



        Scanner myObj = new Scanner(System.in);
        System.out.println("Please write you name under here.");
        String inpt1 = myObj.next();
        System.out.println(inpt1);
        boolean check = inpt1.isEmpty();
        if (check == true){

            System.out.println("Hmmm Looks like we didn't receive your input");
            System.out.println("Please try again");
            run();

        }

    }
}


class Caller{
    public static void main(String args[]){
        Checker c = new Checker();
        c.run();
    }
}