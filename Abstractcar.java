package project;




//Abstract class Car with abstract methods
abstract class CarOfKhush 
{
 abstract void startEngine();
 abstract void accelerate();
 abstract void brake();

 // Concrete method
 void honk() 
 {
     System.out.println("Beep beep!");
 }
}

//Concrete class Toyota extends Car
class Bmw extends CarOfKhush 
 {
 void startEngine() 
 {
     System.out.println("bmw engine started!");
 }


 void accelerate() 
 {
     System.out.println("Bmw is accelerating!");
 }

 
 void brake() 
 {
     System.out.println("bmw is braking!");
 }
}

//Concrete class Honda extends Car
class Audi extends CarOfKhush 
{
 
 void startEngine() 
 {
     System.out.println("Honda engine started!");
 }

 
 void accelerate() 
 {
     System.out.println("Honda is accelerating!");
 }

 
 void brake() 
 {
     System.out.println("Honda is braking!");
 }
}

public class Abstractcar
{
 public static void main(String[] args) 
 {
     // Create objects of Toyota and Honda
     CarOfKhush c1 = new Bmw();
     CarOfKhush c2 = new Audi();

     // Call methods on the objects
     c1.startEngine();
     c1.accelerate();
     c1.brake();
     c1.honk();

     c2.startEngine();
     c2.accelerate();
     c2.brake();
     c2.honk();
 }
}


