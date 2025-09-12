package project;



/*Write a program that illustrates interface inheritance. Interface P is extended 
by P1 and P2. Interface P12 inherits from both P1 and P2. Each interface 
declares.*/

//Interface P
interface P {
 void methodP();
}

//Interface P1 extends P
interface P1 extends P {
 void methodP1();
}

//Interface P2 extends P
interface P2 extends P {
 void methodP2();
}

//Interface P12 extends both P1 and P2
interface P12 extends P1, P2 {
 void methodP12();
}

//Class Implementing P12
class ImplementP12 implements P12 {
 @Override
 public void methodP() {
     System.out.println("Method P");
 }

 @Override
 public void methodP1() {
     System.out.println("Method P1");
 }

 @Override
 public void methodP2() {
     System.out.println("Method P2");
 }

 @Override
 public void methodP12() {
     System.out.println("Method P12");
 }
}

public class InterfaceEx2 {
 public static void main(String[] args) {
     ImplementP12 obj = new ImplementP12();
     obj.methodP();
     obj.methodP1();
     obj.methodP2();
     obj.methodP12();
 }
}


