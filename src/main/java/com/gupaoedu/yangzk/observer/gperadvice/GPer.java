package com.gupaoedu.yangzk.observer.gperadvice;

import java.util.Observable;

/**
 * 观察者模式
 *
 */
public class GPer extends Observable {

    private String name = "Gper"; //社区名称

    private static GPer gPer =null;//懒汉式单例

    public String getName() {
        return name;
    }

    private GPer(){}//单例模式构造方法私有化
    //全局的访问点 创建实例
       public static GPer getInstance(){
           if(gPer==null){
               synchronized (GPer.class){
                   if(gPer == null){
                       gPer = new GPer();
                   }
               }
           }
           return gPer;
       }

       //观察者调用方法
    public void publishQuestion(Question question){
        System.out.println(question.getUserName()+"在"+this.name+"上提交了一个问题");
        setChanged();//打标记 意思是将此对象标记为一个Observable对象(被观察者)
        notifyObservers(question);//观察者调用 观察到被观察者有新操作自动更新操作
    }

}
