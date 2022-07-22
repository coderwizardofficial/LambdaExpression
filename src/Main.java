public class Main {
    public static void main(String[] args) {

        MyInter i=()->{
            System.out.println("Hello, I am lambda Expression");
        };
        i.sayHello();

        MyInter i2=()->{
            System.out.println("I am second lamda expression");
        };
        i2.sayHello();
    }
}
