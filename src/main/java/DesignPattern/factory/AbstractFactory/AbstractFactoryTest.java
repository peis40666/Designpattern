package DesignPattern.factory.AbstractFactory;

import DesignPattern.factory.Phone;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        Factory factory = new HuaweiFactory();
        factory.createPhoe().call();
        factory.createPad().Video();
    }
}
