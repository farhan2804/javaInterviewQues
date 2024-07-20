// Parent class or superclass
class runTimePoly {

    // Superclass
    static class Animal {
        public void makeSound() {
            System.out.println("animal makes sound");
        }
    }

    // Subclass 1
    static class Cat extends Animal {
        public void makeSound() {
            System.out.println("cat meows");
        }
    }

    // Subclass 2
    static class Dog extends Animal {
        public void makeSound() {
            System.out.println("dog barks");
        }
    }

    public static void main(String args[]) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}
