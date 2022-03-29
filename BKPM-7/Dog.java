public class Dog extends Animal {
    public void makeNoise () {
        System.out.println("bark");
        
    }
    Animal animal = new Animal () ;
        animal.makeNoise ();
        Dog dog = new Dog();
        dog.makeNoise () ;
        
        if (animal instanceof Animal)
        System.out.println("animal is Animal");
        if (dog instanceof Animal)
        System.out.println("dog is Animal");
        if (animal instanceof DOg)
        System.out.println("animal is Dog")
            
        }
