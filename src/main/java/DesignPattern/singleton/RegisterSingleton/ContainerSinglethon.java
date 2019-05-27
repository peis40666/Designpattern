package DesignPattern.singleton.RegisterSingleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by peis 2019/5/25
 */
public class ContainerSinglethon {
    private ContainerSinglethon(){}
    private  static Map<String,Object> ioc = new ConcurrentHashMap<>();
    private static Object getBean(String beanName){
        synchronized (ioc){
            Object obj = null;
            if(!ioc.containsKey(beanName)){

                try {
                    obj = Class.forName(beanName);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                ioc.put(beanName,obj);
            }else{
                obj = ioc.get(beanName);
            }
            return obj;
        }
    }
}
