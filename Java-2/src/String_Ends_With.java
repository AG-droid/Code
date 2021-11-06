package ends_with;



class Ends_With{

    void checker(){

        String s1 = "My name is Anmol Goyal";
        if(s1.endsWith("Goyal")){

            System.out.println("Welcome Mr. Goyal");

        }
        else{

            System.out.println("Sorry but your last name is sadly not registered with us sir ;-;");
        }
    }
}



class Caller{
    public static void main(String[] args){
        Ends_With e = new Ends_With();
        e.checker();
    }
}