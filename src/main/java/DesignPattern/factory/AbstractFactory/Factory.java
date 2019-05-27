package DesignPattern.factory.AbstractFactory;

import DesignPattern.factory.Phone;

/**
 * 抽象工厂
 */
public interface Factory {
    Phone createPhoe();
    Pad createPad();
}
