package DesignPattern.Prototype.Deep;

/**
 * Created by peis 2019/5/27
 */
public class DeepCloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Qitiandashen qitiandashen = new Qitiandashen();

        //深拷贝，拔一根毫毛
        Qitiandashen copy = (Qitiandashen) qitiandashen.clone();

        //判断金箍棒是否是同一根金箍棒
        System.out.println("深克隆："+(qitiandashen.getJingubang()==copy.getJingubang()));
    }
}
