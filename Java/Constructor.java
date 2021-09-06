class Student3{

    int id;
    String name;
    String sec;

     Student3(int i, String n){
      id = i;
      name = n;
    }
    
    Student3(int i, String n, String s){
        id = i;
        name = n;
        sec = s;
      }

    
    void display(){System.out.println(id+" "+name + " " + sec);}  

    public static void main(String args[]){

        Student3 s1 = new Student3(345,"Anmol","D");
        Student3 s2 = new Student3(456,"John","E");

        s1.display();
        s2.display();
    }
}