class Switch {

    public static void main(String[] args){

       int[] arr1 = {50,60};


       switch(arr1[0]){

        case 50:

            switch(arr1[1]){
                case 60:
                System.out.println("arr1 contains both 50 and 60");
                break;
                default:
                System.out.println("arr1 only contains 50");
                break;
                
            }
            break;
        default:
        System.out.println("Sorry arr1 doesn't contain 50 nor 60 ");
            
        
       }

    }
}