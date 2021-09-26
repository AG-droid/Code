class common{
    int marks(){
        return 0;
    }

}

class Student1 extends common{
    int marks(){
        return 30;
    }
}


class Student2 extends common{
    int marks(){
        return 70;
    }
}

class Student3 extends common{
    int marks(){
        return 80;
    }
}

class Student4 extends common{
    int marks(){
        return 100;
    }
}

class Student5 extends common{
    int marks(){
        return 98;
    }
}


class Call{
  
    public static void main(String args[]){

        Student1 s1 = new Student1();
        Student2 s2 = new Student2();
        Student3 s3 = new Student3();
        Student4 s4 = new Student4();
        Student5 s5 = new Student5();

        System.out.println("Student 1 obtained " + s1.marks() + "out of 100");
        System.out.println("Student 2 obtained " + s2.marks() + "out of 100");
        System.out.println("Student 3 obtained " + s3.marks() + "out of 100");
        System.out.println("Student 4 obtained " + s4.marks() + "out of 100");
        System.out.println("Student 5 obtained " + s5.marks() + "out of 100");

    }
}