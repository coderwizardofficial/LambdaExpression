public class MyInterImpl implements MyInter{

    @Override
    public void sayHello() {
        System.out.println("I am coderwizard from MyInterImpl");

        MyInter myInter = new MyInterImpl();
        myInter.sayHello();
    }
}
