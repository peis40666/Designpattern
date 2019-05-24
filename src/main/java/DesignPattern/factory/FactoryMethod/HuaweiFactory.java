package DesignPattern.factory.FactoryMethod;

import DesignPattern.factory.Huawei;
import DesignPattern.factory.Phone;

public class HuaweiFactory implements PhoneFactory {
    @Override
    public Phone createPhone() {
        return new Huawei();
    }
}
