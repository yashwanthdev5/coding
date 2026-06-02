package OOPs;

class Animal{
     // whenever we are using static the method refrence is taken and printed
      static void sound()
      {
        System.out.println("Animal sound");
      }
       void bark()
       {
        System.out.println("barking");
       }
}
class Dog extends Animal
{
     // method Overriding..
       static  void sound()
       {
        System.out.println("Dog sound");
       }
       //gives compilation error if only present in this class...
        final  void bark()
       {
        System.out.println("bark");
       }
       
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Animal a =new Dog();
        a.sound();
        a.bark();
    }
}
