package com.mashibing.singleton;

/**
 * @author zhouyx
 * @date 2019/5/13 14:11
 *
 * 和01是一样的
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;
    static {
        INSTANCE = new Mgr02();
    }


    private Mgr02(){};

    public static Mgr02 getInstance(){
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }
    public static void main(String[] args){
        Mgr02 m1 = Mgr02.getInstance();
        Mgr02 m2 = Mgr02.getInstance();
        System.out.println(m1==m2);
    }
}
