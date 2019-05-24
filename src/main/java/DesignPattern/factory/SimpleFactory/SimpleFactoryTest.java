package DesignPattern.factory.SimpleFactory;

import DesignPattern.factory.Phone;

public class SimpleFactoryTest {
    public static void main(String[] args) throws ClassNotFoundException {
        PhoneFactory factory = new PhoneFactory();
        Phone phone = factory.createPhone((Class<? extends Phone>) Class.forName("DesignPattern.factory.Huawei"));
        phone.call();
    }
}
