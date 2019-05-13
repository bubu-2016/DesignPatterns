package com.mashibing.singleton;

/**
 * @author zhouyx
 * @date 2019/5/13 14:11
 *
 * 静态内部类的方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 */
public class Mgr07 {

    private Mgr07(){};

    private static class Mgr07Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance(){
        return Mgr07Holder.INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }


    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(new Mgr07().getInstance().hashCode())).start();
        }
    }
}
