package polymorphism;



public class Test {


    public static void main(String[] args){


        Animal a = new Animal();
        a.animalSound();

        Animal d = new Dog();
        d.animalSound();

        Animal c = new Cat();
        c.animalSound();
    }
    
}
