package com.gupaoedu.yangzk.decorator.battercake;

import java.math.BigDecimal;

/**
 * 定义一个煎饼类 继承我们这个抽象的煎饼类
 */
public abstract class Batrercake{

   protected abstract String getMsg();//商品名称
   protected abstract BigDecimal getPrice();//价格
}
