package DesignPattern.Delegate;

/**
 * Created by peis 2019/5/29
 */
public class EmpC implements IEmployee {
    @Override
    public void doCommand(String command) {
        System.out.println("我是员工C,我负责系统架构。开始"+command+"工作");

    }
}
