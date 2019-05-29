package DesignPattern.Proxy.dynamicProxy.cglib;

import DesignPattern.Proxy.Person;
import DesignPattern.Proxy.dynamicProxy.Custom;

/**
 * Created by peis 2019/5/28
 */
public class CglibTest {
    public static void main(String[] args) {
        Custom custom = new Custom();

        Person person = (Person) new CglibMepo().getInstance(custom.getClass());
        person.findlove();
    }
}
