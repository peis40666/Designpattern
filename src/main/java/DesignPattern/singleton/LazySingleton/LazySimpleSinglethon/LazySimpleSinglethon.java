package DesignPattern.singleton.LazySingleton.LazySimpleSinglethon;

public class LazySimpleSinglethon {
    private static LazySimpleSinglethon singlethon = null;

    private LazySimpleSinglethon(){}

    public synchronized static LazySimpleSinglethon getInstance(){
        if(singlethon==null){ //如果不加synchronizde会存在线程安全问题
            singlethon = new LazySimpleSinglethon();
        }

        return singlethon;
    }
}
