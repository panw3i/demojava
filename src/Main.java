

public class Main {

    public static void main(String[] a) {

        Cat cat = new Cat();
        method(cat);
    }

    public static void method(Animal animal){
        animal.eat();
    }


}

interface Animal {
   abstract void eat();
}

class Cat implements Animal{
    int num =20;
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
