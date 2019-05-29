package DesignPattern.Proxy.staticProxy;

/**
 * Created by peis 2019/5/27
 */
public class staticProxyTest {

    public static void main(String[] args) {
        Son son = new Son();
        Parent parent = new Parent(son);
        //代理找对象
        parent.findlove();
    }
}
