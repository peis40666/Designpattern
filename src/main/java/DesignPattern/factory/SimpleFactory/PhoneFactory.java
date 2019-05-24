package DesignPattern.factory.SimpleFactory;

import DesignPattern.factory.Phone;

public class PhoneFactory {
    Phone createPhone(Class<? extends Phone> clazz){
        if(clazz!=null){
            try {
                return clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
