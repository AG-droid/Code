class Student{
    int id;
    String name;
    String sec;
}

class Test{
    public static void main(String args[]){

        Student me = new Student();
        me.id = 23;
        me.name = "Anmol Goyal";
        me.sec = "10 D";
        System.out.println(me.name + " of class " + me.sec + " has been assigned the roll number " + me.id );
    }
}