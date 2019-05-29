package DesignPattern.Delegate;

/**
 * Created by peis 2019/5/29
 */
public class EmpB implements IEmployee{
    @Override
    public void doCommand(String command) {
        System.out.println("我是员工B,我负责业务开发。开始"+command+"工作");

    }
}
