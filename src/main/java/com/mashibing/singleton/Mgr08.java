package com.mashibing.singleton;

/**
 * @date 2019/5/13 15:36
 *
 * 不仅可以解决线程同步 还可以防止反序列化
 * 枚举单例
 * effective java
 *
 * 枚举方法没有构造方法
 */
public enum Mgr08 {
    INSTANCE;
    public void m(){}
    public static void main(String[] args){
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Mgr08.INSTANCE.hashCode())).start();
        }
    }
}
