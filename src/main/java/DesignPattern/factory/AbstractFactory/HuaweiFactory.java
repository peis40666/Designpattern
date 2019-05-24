package DesignPattern.factory.AbstractFactory;

import DesignPattern.factory.Huawei;
import DesignPattern.factory.Phone;

public class HuaweiFactory implements Factory {
    @Override
    public Phone createPhoe() {
        return new Huawei();
    }

    @Override
    public Pad createPad() {
        return new HUaweiPad();
    }
}
