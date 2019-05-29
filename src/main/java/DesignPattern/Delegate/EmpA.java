package DesignPattern.Delegate;

/**
 * Created by peis 2019/5/29
 */
public class EmpA implements IEmployee{

    @Override
    public void doCommand(String command) {
        System.out.println("我是员工A,我负责网络安全。开始"+command+"工作");
    }
}
