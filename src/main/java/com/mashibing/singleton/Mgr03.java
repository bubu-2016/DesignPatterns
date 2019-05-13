package com.mashibing.singleton;

/**
 * @author zhouyx
 * @date 2019/5/13 14:11
 *
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {

    }

    public static Mgr03 getInstance() {
        if (INSTANCE == null) {
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }
    public void m() {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            //内部匿名类
//            new Thread(new Runnable() {
//                public void run() {
//                    System.out.println(Mgr03.getInstance().hashCode());
//                }
//            }).start();

            //只有一个方法的内部匿名类 java8 使用lambda表达式 等价于上面的写法
            new Thread(() -> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();

            //还可以简写为以下方式
//            new Thread(() ->
//                System.out.println(Mgr03.getInstance().hashCode())
//            ).start();
        }
    }


}
