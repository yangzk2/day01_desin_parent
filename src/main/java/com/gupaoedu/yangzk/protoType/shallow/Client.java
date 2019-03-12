package com.gupaoedu.yangzk.protoType.shallow;

public class Client{

    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype startClone(Prototype concretePrototype){
        return concretePrototype.clone();
    }
}
