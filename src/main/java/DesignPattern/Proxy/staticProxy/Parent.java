package DesignPattern.Proxy.staticProxy;

import DesignPattern.Proxy.Person;

/**
 * Created by peis 2019/5/27
 *
 * 父母为子女相亲
 */
public class Parent implements Person {
    private Son son;

    public Parent(Son son) {
        this.son = son;
    }

    @Override
    public void findlove() {
        System.out.println("父母开始物色对象");
        son.findlove();
        System.out.println("确定关系，双方同意交往");
    }
}
