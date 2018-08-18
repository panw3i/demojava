import sun.rmi.runtime.Log;

public class Main {

    public static void main(String[] a) {
        B b = new B("sss");
        b.print();

    }


}

class A {
    int a = 1;
    int b = 10;
    final String STATE = "定义一个常量";
    public  A(String s ){

        System.out.println("父类初始化");
    }
    private static void show(){
        System.out.println("A");
    }
}

class B extends A{
    public B(String s){
        super(s);
    }

    int b =2;
    public void print(){
        System.out.println(this.b);
        System.out.println(super.b);
    }

}