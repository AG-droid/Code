package inhert;


class Animal{
    void eat(){
        System.out.println("eating....");
    }
}

class Dog extends Animal{

    void bark(){

        System.out.println("barking......");
    }
}

class Cat extends Dog{

    void meow(){
        System.out.println("Meowing.......");
    }
}

class Lion extends Cat{

    void roar(){
        System.out.println("Roaring....");
    }
}


class multi{

    public static void main(String args[]){

        Lion l = new Lion();
        l.eat();
        l.bark();
        l.meow();
        l.roar();
    }
}