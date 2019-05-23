package DesignPattern.factory.SimpleFactory;

import DesignPattern.factory.Phone;

public class SimpleFactoryTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Class.forName("DesignPattern.factory.HuaweiPone");
        Phone phone =  PhoneFactory.createPhone(clazz);
        phone.call();
    }
}
