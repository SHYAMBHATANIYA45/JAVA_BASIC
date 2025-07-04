public class Inheritance{
    public static void main(String args[]){
       // Fish shark = new Fish();
        //shark.eat();
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
    } 
}
class   Animal{
    String color ;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//derived class 
//class Fish extends Animal{
  //  int fins;
    //void swims(){
      //  System.out.println("Swims in water");
    //}
//}
class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
 String breed;
} 