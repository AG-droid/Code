package  Super_Class;



class Parent{

    String name = "John";
}

class Child extends Parent{

  String name = "Mark";
  void print(){
      System.out.println(name);
      System.out.println(super.name);
  }

}

class caller{

    public static void main(String args[]){

        Child c = new Child();
        c.print();
    }
}