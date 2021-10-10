package String_Buffer;



class reverse{

    void run(){

        StringBuffer s = new StringBuffer("Gustav");
        s.reverse();
        System.out.println(s);

    }
}


class insert{
    void run(){

        StringBuffer s = new StringBuffer("Gustav");
        s.insert(4,"aaaaaaaaaa");
        System.out.println(s);
    }
}


class replace{
    void run(){
        StringBuffer s = new StringBuffer("Gustav");
        s.replace(0,6, "Rohan");
        System.out.println(s);
    }
}

class delete{

    void run(){
    StringBuffer s = new StringBuffer("Gustav");
    s.delete(0,5);
    System.out.println(s);

}
}


class capacity{
    void run(){

        StringBuffer s = new StringBuffer();
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