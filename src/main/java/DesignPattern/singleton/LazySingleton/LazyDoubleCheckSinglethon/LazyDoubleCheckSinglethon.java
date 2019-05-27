package DesignPattern.singleton.LazySingleton.LazyDoubleCheckSinglethon;

/**
 * Created by peis
 *
 * 由于加锁，对程序性能有一定影响
 */
public class LazyDoubleCheckSinglethon {

    private static LazyDoubleCheckSinglethon singlethon = null;

    private  LazyDoubleCheckSinglethon(){}

    public static LazyDoubleCheckSinglethon getInstance(){
        if(singlethon==null){
            synchronized (LazyDoubleCheckSinglethon.class){
                if(singlethon==null){
                    singlethon = new LazyDoubleCheckSinglethon();
                }
            }
        }
        return singlethon;
    }
}
