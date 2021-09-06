class Student {

    
    int id;
    String Name;
 
   
    
}

class Caller{

    public static void main(String[] args){


        Student s1 = new Student();
        s1.id = 100;
        s1.Name = "Rohan";
        System.out.println(s1.id);
        System.out.println(s1.Name);

    }
}