package DesignPattern.factory.SimpleFactory;

import DesignPattern.factory.Huawei;
import DesignPattern.factory.Phone;

public class SimpleFactoryTest {
    public static void main(String[] args) throws ClassNotFoundException {
        PhoneFactory factory = new PhoneFactory();
        Phone phone = factory.createPhone(Huawei.class);
        phone.call();
    }
}
