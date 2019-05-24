package DesignPattern.factory.FactoryMethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        PhoneFactory factory = new HuaweiFactory();
        factory.createPhone();
    }
}
