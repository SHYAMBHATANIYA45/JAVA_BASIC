public class Polymorphism{
    public static void main(String args[]){
    Calculator calc = new Calculator();
    System.out.println(calc.sum(1,(float)5.2));
     System.out.println(calc.sum(15 , 2));
      System.out.println(calc.sum(1,5,2)); 
      //overriding
    Deer d = new Deer();
    d.eat();
 }
}
class Calculator{
    int sum(int a , int b){
        return a + b ;
    }
     float sum(float a ,float b){
     return a+b;
     
     }
      int sum(int a , int b , int c){
        return a + b + c ;
    }
}
//overriding
class  Animal {
    void eat(){
            System.out.println("eats anything");
    }
}
class Deer extends Animal {
    void eat(){
            System.out.println("eats grass");
    }
}