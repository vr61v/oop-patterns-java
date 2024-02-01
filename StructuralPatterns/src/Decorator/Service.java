package Decorator;

public abstract class Service {
    protected String name;
    public Service(String name){
        this.name = name;
    }
    public abstract int GetPrice();
    public String WhatItIs(){
        return name;
    }
}
