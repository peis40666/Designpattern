package DesignPattern.Proxy.dynamicProxy.jdk;

import DesignPattern.Proxy.Person;
import DesignPattern.Proxy.dynamicProxy.Custom;

/**
 * Created by peis 2019/5/28
 */
public class JDKProxy {
    public static void main(String[] args) {
        Person person = (Person) new JDKMepo().getInstance(new Custom());
        person.findlove();
    }
}
