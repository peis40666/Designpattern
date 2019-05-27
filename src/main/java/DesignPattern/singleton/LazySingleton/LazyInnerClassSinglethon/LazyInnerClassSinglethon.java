package DesignPattern.singleton.LazySingleton.LazyInnerClassSinglethon;

/**
 * Created by peis 2019/5/25
 * 内部类形式对单例
 */
public class LazyInnerClassSinglethon {


    private LazyInnerClassSinglethon(){
        if(LazyHolder.LAZY !=null){ //为了防止反射恶意破坏单例而抛出对异常
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    private LazyInnerClassSinglethon getInstance() {

        return LazyHolder.LAZY;
    }

    //默认不加载
    private static class LazyHolder{
        private static  final  LazyInnerClassSinglethon LAZY = new LazyInnerClassSinglethon();
    }

}
