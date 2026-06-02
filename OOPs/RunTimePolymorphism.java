package OOPs;

class Animal{
      void sound()
      {
        System.out.println("Animal sound");
      }
      void bark()
       {
        System.out.println("bark");
       }
}
class Dog extends Animal
{
     // method Overriding..
       void sound()
       {
        System.out.println("Dog sound");
       }
       // gives compilation error if only present in this class...
    //     void bark()
    //    {
    //     System.out.println("bark");
    //    }
       
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Dog a=new Dog();
        a.sound();
        a.bark();
    }
}
