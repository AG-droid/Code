package Ovr_ride;


class Bank{
    int intrst(){
        return 0;
    }
}

class Axis extends Bank{
    int intrst(){
        return 10;
    }
}

class HDFC extends Bank{

    int intrst(){
        return 15;
    }
}

class PNB extends Bank{
    int intrst(){
        return 20;
    }
}

class Caller{

    public static void main(String args[]){

        Axis a = new Axis();
        HDFC h = new HDFC();
        PNB p = new PNB();
        System.out.println(a.intrst());
        System.out.println(h.intrst());
        System.out.println(p.intrst());


    }
}