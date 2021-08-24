class LeapYear{

    public static void main(String args[]){

        int year1 = 1975;

        if((year1 % 4 == 0) || (year1 % 100 == 0)){
            System.out.println(year1 + " is a leap year and contains 366 days in total");
        }
        else{
            System.out.println(year1 + " is just a regular year and thus only contains 365 days");
        }

    }

}


//This is a test given below