package hyb_inhert;



class Animal{
    void eat(){
        System.out.println("eating....");
    }
}

class lazy{
    void sleep(){
        System.out.println("Sleeping.....");
    }
}


class Dog extends lazy{
    void bark(){
        System.out.println("Barking.......");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meowing.....");
    }
}


class Call{

    public static void main(String args[]){

        Cat c = new Cat();
        Dog d = new Dog();
        c.eat();
        c.meow();
        d.bark();
        d.sleep();
    }
}