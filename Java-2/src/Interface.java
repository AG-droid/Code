package intrface;



interface Shape{
    void draw();
}

class Rect implements Shape{

   public void draw(){

        System.out.println("Drawing Rectangle");
    }
}


class Tri implements Shape{

    public void draw(){

        System.out.println("Drawing Triangle");

    }
}

class caller{

    public static void main(String args[]){

        Shape s = new Tri();
        s.draw();

    }
}