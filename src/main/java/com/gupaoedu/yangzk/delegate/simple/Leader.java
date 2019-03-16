package com.gupaoedu.yangzk.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader {

    private Map<String,IEmployee> register = new HashMap<String,IEmployee>();
    public Leader() {
        register.put("加密",new EmployeeA());
        register.put("架构",new EmployeeB());
    }

    //预先知道每个员工的特长、特征，分发任务
    public void doing(String command){
        register.get(command).doing(command);
    }
}
