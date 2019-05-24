package DesignPattern.factory;

public class Apple implements Phone{

    @Override
    public void call() {
        System.out.println("我是苹果手机，我可以打电话。");
    }
}
