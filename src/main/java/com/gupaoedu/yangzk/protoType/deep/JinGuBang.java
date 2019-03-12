package com.gupaoedu.yangzk.protoType.deep;

import java.io.Serializable;

public class JinGuBang implements Serializable {

    public float h = 100;
    public float d = 10;
    /**
     * 变大
     */
    public void big(){
        this.h*=2;
        this.d*=2;
    }
    /**
     * 变小
     */
    public void small(){
        this.h/=2;
        this.d/=2;
    }
}
