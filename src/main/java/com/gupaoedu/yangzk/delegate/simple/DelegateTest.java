package com.gupaoedu.yangzk.delegate.simple;

public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("架构",new Leader());
    }
}
