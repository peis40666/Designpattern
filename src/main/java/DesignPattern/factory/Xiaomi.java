package DesignPattern.factory;

public class Xiaomi implements Phone {
    @Override
    public void call() {
        System.out.println("我是小米手机，我可以打电话");
    }
}
