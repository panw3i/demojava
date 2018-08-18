

public class Main {

    public static void main(String[] a) {

        Cat cat = new Cat();
        method(cat);
    }

    public static void method(Animal animal){
        animal.eat();
    }


}

abstract class Animal {
    int num = 10;
    abstract public void eat();
}

class Cat extends Animal{
    int num =20;
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃屎");
    }
}