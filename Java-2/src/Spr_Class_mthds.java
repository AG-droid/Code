package Spr_mthd;


class Python{
   Python(){
        System.out.println("Python is fast");
    }
}

class Java extends Python{

        Java(){
         super();
        System.out.println("But java is faster");

    }
}

class caller{
    public static void main(String args[]){
        Java j = new Java();

    }
}