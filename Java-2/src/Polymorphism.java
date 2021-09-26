package Poly;



class Shape{

    void drawing(){
        System.out.println("This is a shape");
    }
}


class Rect extends Shape{

    void drawing(){
        System.out.println("This is a rectangle");
    }
}


class Tri extends Shape{

    void drawing(){
        System.out.println("This is a triangle");
    }
}

class caller{

    public static void main(String args[]){

        Shape s;
        s = new Rect();
        s.drawing();
        s = new Tri();
        s.drawing();
        s = new Shape();
        s.drawing();
    }
}