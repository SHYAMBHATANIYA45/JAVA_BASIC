public class Abstract{
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        Panir p = new Panir();
        p.eat();
        p.walk();
        System.out.println(p.color);
        //interface object
        Queen c = new Queen();
        c.moves();
       Donkey q = new Donkey();
        System.out.println(q.color);
  } 
} 
//creat abstract class
abstract class Animal{
    String color;
    Animal(){
        color ="brown";
    }
    void eat(){
        System.out.println("animal eats");
}
  abstract void walk();
}

 class Horse extends Animal{
    //here horse class implement the (walk) ..its necessary for it 
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Panir extends Animal{
    void changecolor(){
        color = "white";
    }
    void walk(){
        System.out.println("panir is a protien food");
    }
}
 //interface 
 interface Chesspalyer{
    void moves();
 }
 class Queen implements Chesspalyer{
    public void moves(){
   System.out.println("up , down ,left ,right, daigonal");
    }
 }

 class Rook implements Chesspalyer{
    public void moves(){
        System.out.println("up ,down, left , right");
    }
 }

 //super keyword
 class Birds{
    String color;
   Birds(){
        System.out.println("animal constructor is called");
    }
 }
 class Donkey extends Birds{
   Donkey(){
    super.color = "brown";
        System.out.println("horse constructor is called");
    }
 }