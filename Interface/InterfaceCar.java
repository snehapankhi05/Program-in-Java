package project;




//Define an interface for a Car
interface Car 
{
 void startEngine();
 void accelerate();
 void brake();
}

//Create a class that implements the Car interface
class Toyota implements Car 
{
 
 public void startEngine() 
 {
     System.out.println("Toyota engine started!");
 }


 public void accelerate() 
 {
     System.out.println("Toyota is accelerating!");
 }

 
 public void brake() 
 {
     System.out.println("Toyota is braking!");
 }
}

//Create another class that implements the Car interface
class Ferrai implements Car 
{
 
 public void startEngine() 
 {
     System.out.println("ferrai engine started!");
 }

 
 public void accelerate() 
 {
     System.out.println("ferrai is accelerating!");
 }

 
 public void brake() 
 {
     System.out.println("Ferrai is braking!");
 }
}

public class InterfaceCar 
{
 public static void main(String[] args) 
 {
     // Create objects of Toyota and Honda
     Car c1 = new Toyota();
     Car c2 = new Ferrai();

     // Call methods on the objects
     c1.startEngine();
     c1.accelerate();
     c1.brake();

     c2.startEngine();
     c2.accelerate();
     c2.brake();
 }
}


