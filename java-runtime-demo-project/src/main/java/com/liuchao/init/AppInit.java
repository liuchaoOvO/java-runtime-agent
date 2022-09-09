package com.liuchao.init;

/**
 * @Classname AppInit
 * @Date 2022/9/9 下午3:00
 * @Created by liuchao58
 * @Description
 */
// 模拟的应用初始化的类
public class AppInit {

    public static void init() {
        try {
            System.out.println("APP初始化中...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
