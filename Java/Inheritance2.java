class Inheritance2{
    float salary = 400000;
}
class Programmer extends Inheritance2{

    int bonus = 10000;



public static void main(String[] args){

    Programmer p = new Programmer();
    System.out.println("The salary of a programmer is $ "+ p.salary);
    System.out.println("The bonus of a programmer is $ "+ p.bonus);


}}
