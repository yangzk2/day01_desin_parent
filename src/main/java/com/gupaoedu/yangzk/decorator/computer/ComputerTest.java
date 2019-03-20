package com.gupaoedu.yangzk.decorator.computer;

/**
 * 装饰者模式-电脑购买
 */
public class ComputerTest {
    public static void main(String[] args) {
        //购买一台电脑
        Computer computer = new BaseComputer();
        System.out.println("我想购买一台"+computer.getMsg()+"单价:"+computer.getPrice());
        //不能光有电脑呀 我还想在加一个键盘
        computer = new ComputerAndKeyboard(computer);
        System.out.println("我想购买一台"+computer.getMsg()+"单价:"+computer.getPrice());
        //我还想加一个耳机
        computer = new ComputerAndEarpiece(computer);
        System.out.println("我想购买一台"+computer.getMsg()+"单价:"+computer.getPrice());
    }
}
