package com.gupaoedu.yangzk.delegate.simple;

public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工A,我开始搬砖了，擅长加密，执行"+command);
    }
}
