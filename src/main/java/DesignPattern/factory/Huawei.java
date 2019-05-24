package DesignPattern.factory;

public class Huawei implements Phone{


    @Override
    public void call() {
        System.out.println("我是华为手机，我可以打电话。");
    }
}
