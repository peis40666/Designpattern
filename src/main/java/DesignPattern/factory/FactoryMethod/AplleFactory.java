package DesignPattern.factory.FactoryMethod;

import DesignPattern.factory.Apple;
import DesignPattern.factory.Phone;

public class AplleFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new Apple();
    }
}
