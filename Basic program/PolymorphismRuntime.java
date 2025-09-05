package project;

//Java Program for Method Overriding

//Class 1
//Helper class
class Parent {

 // Method of parent class
 void Print() {
     System.out.println("parent class");
 }
}

//Class 2
//Helper class
class subclass1 extends Parent {

 // Method
 void Print() { 
   System.out.println("subclass1"); 
 }
}

//Class 3
//Helper class
class subclass2 extends Parent {

 // Method
 void Print() {
     System.out.println("subclass2");
 }
}

//Class 4
//Main class
class PolymorphismRuntime {

 // Main driver method
 public static void main(String[] args) {

     // Creating object of class 1
     Parent a = new subclass1();
     Parent a1= new subclass2();
     // Now we will be calling print methods
     // inside main() method
     
     a.Print();

     
     a1.Print();
 }
}

