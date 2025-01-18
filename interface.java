interface Animal {
  void animalSound();
  void sleep();
}
interface Sound{
  void animalSound();
  void sleep();
}
class Dog implements Animal,Sound {
  public void animalSound() {
     System.out.println("The dog bark");
  }
  public void sleep() {
     System.out.println("Zzz");
  }
}
class Cat implements Animal, Sound {
  public void animalSound() {
     System.out.println("The cat mew");
  }
  public void sleep() {
     System.out.println("Zzz");
  }
}
class Main {
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.animalSound();
    myDog.sleep();
    Cat myCat =new Cat();
    myCat.animalSound();
    myCat.sleep();
  }
}