class Formula{

    int square (int n){
        return n*n;
    }
}


class aggregation{

    Formula fr;
    double hlf = (Math.sqrt(3))/4;

    double area(int length){
        fr = new Formula();
        int Lsquare = fr.square(length);
        return hlf * Lsquare;
    }



    public static void main(String args[]) {

        aggregation T = new aggregation();
        double result = T.area(27);
        System.out.println(result);
    }
}