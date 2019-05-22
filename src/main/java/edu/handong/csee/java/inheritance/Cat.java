package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {  //hiding이다
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {  //overriding이다
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;    // polymorphism이다
        Animal.testClassMethod();   // animal메소드의클래스를 출력한다
        myAnimal.testInstanceMethod();// 인스턴스 메소드인 cat을 출력한다 
        
        Dog myDog = new Dog();
        Animal myAnimal2 = myDog;   //polymorphism이다
        Animal.testClassMethod();   // animal메소드의클래스를 출력한다
        myAnimal2.testInstanceMethod();// 인스턴스 메소드인 dog을 출력한다
    }
}
