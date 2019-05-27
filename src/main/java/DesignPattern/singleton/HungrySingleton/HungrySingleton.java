package DesignPattern.singleton.HungrySingleton;

public class HungrySingleton {
    private static final HungrySingleton singleton;

    static {
        singleton = new HungrySingleton();
    }


    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return singleton;
    }
}


