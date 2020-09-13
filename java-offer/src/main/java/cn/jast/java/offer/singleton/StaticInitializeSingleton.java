package cn.jast.java.offer.singleton;

public class StaticInitializeSingleton {

    private static StaticInitializeSingleton instance ;

    static{
        instance = new StaticInitializeSingleton();
    }

    private StaticInitializeSingleton(){

    }

    public static StaticInitializeSingleton getInstance(){
        return instance;
    }
}
