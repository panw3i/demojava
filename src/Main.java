

public class Main {

    public static void main(String[] a) {
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println("主方法执行");
    }

    static {
        System.out.println("定义在主方法的静态代码块");
    }
}

class Person{
   private int width;
   private int height;
   static String country;

    {
        System.out.println("构建代码块1");
    }

    {
        System.out.println("构建代码块2");
    }


    public Person(){};

   public Person(int width,int height){
       this.width = width;
       this.height = height;

   }

    static {
        System.out.println("静态代码块1");
    }

   public void setWidth(int width){
       this.width = width;
   }

   public void setHeight(int height){
       this.height = height;
   }

   public int getWidth(){
       return this.width;
   }

   public int getHeight(){
       return this.height;
   }

   public int getArea(){
       return this.width * this.height;
   }

   static {
       System.out.println("静态代码块2");
   }

}
