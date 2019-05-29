package DesignPattern.Proxy.dynamicProxy.jdk;

import DesignPattern.Proxy.staticProxy.Son;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by peis 2019/5/27
 * 媒婆代理找对象
 */
public class JDKMepo implements InvocationHandler {

    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    public void before(){
        System.out.println("开始物色对象");
    }


    public void after(){
        System.out.println("找到了你想要的男孩，双方同意正式交往");
    }
}
