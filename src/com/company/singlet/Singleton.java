package com.company.singlet;

public class Singleton {

    private static volatile Singleton instance;

    public static synchronized Singleton getInstance() {

        if (instance == null)
                instance=new Singleton();

        return instance;
    }

    private Singleton(){

    }
}
