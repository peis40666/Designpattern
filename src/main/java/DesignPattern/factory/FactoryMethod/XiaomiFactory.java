package DesignPattern.factory.FactoryMethod;

import DesignPattern.factory.Phone;
import DesignPattern.factory.Xiaomi;

public class XiaomiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Xiaomi();
    }
}
