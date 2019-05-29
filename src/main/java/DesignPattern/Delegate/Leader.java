package DesignPattern.Delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by peis 2019/5/29
 */
public class Leader implements IEmployee{

    private Map<String,IEmployee> register = new HashMap<>();

    public Leader() {
        this.register.put("网络安全",new EmpA());
        this.register.put("业务开发",new EmpB());
        this.register.put("系统架构",new EmpC());
    }

    @Override
    public void doCommand(String command) {
        if(register.containsKey(command)){
            IEmployee emp =  register.get(command);
            emp.doCommand(command);
        }else{
            System.out.println("您下达的命令有误，请重新下达");
        }
    }
}
