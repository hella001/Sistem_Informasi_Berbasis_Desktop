public class Animal {
    public void makeNoise () {
        System.out.println("talk");   
    }
}
class Dog extends Animal{
    @Override
    public void makeNoise () {
        System.out.println("bark");  
    }
    public static void main (String[] args) {
    Animal animal = new Animal () ;
        animal.makeNoise ();
        Dog dog = new Dog();
        dog.makeNoise () ;
        
        if (animal instanceof Animal)
        System.out.println("animal is Animal");
        if (dog instanceof Animal)
        System.out.println("dog is Animal");
        if (animal instanceof Dog)
        System.out.println("animal is Dog");
    } 
        }
