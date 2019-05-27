package DesignPattern.singleton.RegisterSingleton;

/**
 * Created by peis 2019/5/25
 *
 * 枚举式单例也《Effective Java》书中推荐的一种单例实现写法。
 * 在 JDK 枚举的语法特殊性，以及反射也为枚举保 驾护航，让枚举式单例成为一种比较优雅的实现。
 */
public enum  EnumSinglethon {
    INSTANCE;
    private Object data;

    public Object getData(){
        return data;
    }

    public static EnumSinglethon getInstance(){
        return INSTANCE;
    }
}
