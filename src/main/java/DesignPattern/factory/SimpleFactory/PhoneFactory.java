package DesignPattern.factory.SimpleFactory;

import DesignPattern.factory.Phone;

public class PhoneFactory {

    public static Phone createPhone(Class<? extends Phone> clazz){
        Phone phone = null;
        if(null!=clazz){
            try {
                phone = clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return phone;
    }
}
