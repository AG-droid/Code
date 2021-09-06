

class Object2{

    int id;
    String name;
}

class Obj{

    public static void main(String[] args){

    Object2 s1 = new Object2();
    Object2 s2 = new Object2();

    s1.id = 154;
    s2.id = 785;
    s1.name = "Rajesh";
    s2.name = "Mohit";
    int total = s1.id + s2.id;

    System.out.println(s1.name + "' and '" + s2.name + " Scored a total of " + total + " points");
    }
}
