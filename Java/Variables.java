

class Variable{

   
    static int m= 100; //Static Variable

    void method(){

        int n = 90; //This is a local Variable
        System.out.println(n);

    }
    public static void main(String args[]){
        int data = 50; //Instance variable
        float ans = data + m;

        System.out.println("The sum of 100 and 50 is of --> " + ans);
    }
    

}
