import java.util.Scanner;

class Inpt{


    public static void EvenOdd(int num){

        if(num%2==0){
            System.out.println(num + " is even");
        }
        else{
            System.out.println(num + " is odd");
        }
    }
    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the required number --> ");

        int num = scan.nextInt();

        EvenOdd(num);

        int i = 0;
        while(i==0){

            Scanner ask = new Scanner(System.in);
            System.out.println("Do you want to continue (y/n) : ");
            String ans = ask.next();
            String z = ans;
            if(z=="y"){
                main(null);
            }
            else{
                System.out.println(z);
                break;
            }
        }

    }

}