package DesignPattern.singleton.LazySingleton.LazySimpleSinglethon;

public class ExecuteThread implements Runnable {
    @Override
    public void run() {
        LazySimpleSinglethon singlethon = LazySimpleSinglethon.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" +singlethon);
    }
}
