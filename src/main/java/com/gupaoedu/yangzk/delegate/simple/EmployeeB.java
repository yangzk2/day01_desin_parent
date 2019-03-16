package com.gupaoedu.yangzk.delegate.simple;

public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工B,我开始搬砖了，擅长架构，执行"+command);
    }
}
