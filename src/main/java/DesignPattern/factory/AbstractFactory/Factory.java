package DesignPattern.factory.AbstractFactory;

import DesignPattern.factory.Phone;

public interface Factory {
    Phone createPhoe();
    Pad createPad();
}
