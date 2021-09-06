class Static{


    int rollno;
    String Name;

    static String sec = "10 D";

    void m(){System.out.println("hello m");}
   this.m();
    Static(int i , String n){
         rollno = i;
         Name = n;

     }
     static void change(){
         sec = "9 C";
     }

     void display(){
         System.out.println("Mr " + Name + " of class " + sec + " has a roll number of " + rollno );
     }


     public static void main(String[] args){


         Static s1 = new Static(57,"Anmol");

         Static s2 = new Static(68,"James");

         s1.display();
         Static.change();
         s2.display();



     }
}