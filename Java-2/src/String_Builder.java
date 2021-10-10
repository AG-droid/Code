package String_Builder;



class reverse{

    void run(){

        StringBuilder s = new StringBuilder("Gustav");
        s.reverse();
        System.out.println(s);

    }
}


class insert{
    void run(){

        StringBuilder s = new StringBuilder("Gustav");
        s.insert(4,"aaaaaaaaaa");
        System.out.println(s);
    }
}


class replace{
    void run(){
        StringBuilder s = new StringBuilder("Gustav");
        s.replace(0,6, "Rohan");
        System.out.println(s);
    }
}

class delete{

    void run(){
        StringBuilder s = new StringBuilder("Gustav");
        s.delete(0,5);
        System.out.println(s);

    }
}


class capacity{
    void run(){

        StringBuilder s = new StringBuilder();
        System.out.println(s.capacity());
        s.append("Hello");
        System.out.println(s.capacity());
        s.append("This is not a test message, but more like a hit and trial message");
        System.out.println(s.capacity());
        s.ensureCapacity(150);
        System.out.println(s.capacity());

    }
}


class Caller{
    public static void main(String args[]){

        reverse r = new reverse();
        insert i = new insert();
        replace re = new replace();
        delete d  = new delete();
        capacity c = new capacity();
        r.run();
        i.run();
        re.run();
        d.run();
        c.run();

    }
}