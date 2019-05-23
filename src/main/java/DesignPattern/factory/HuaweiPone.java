package DesignPattern.factory;

public class HuaweiPone implements Phone {
    @Override
    public void call() {
        System.out.println("我是华为手机");
    }
}
