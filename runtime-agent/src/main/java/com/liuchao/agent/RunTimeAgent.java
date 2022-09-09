package com.liuchao.agent;

import com.liuchao.transformer.RunTimeTransformer;

import java.lang.instrument.Instrumentation;

/**
 * @Classname RunTimeAgent
 * @Date 2022/9/9 下午3:04
 * @Created by liuchao58
 * @Description 构建Agent程序的入口 需配置到 MANIFEST.MF中
 */

public class RunTimeAgent {
    public static void premain(String arg, Instrumentation instrumentation) {
        System.out.println("探针启动！！！");
        System.out.println("探针传入参数：" + arg);
        instrumentation.addTransformer(new RunTimeTransformer());
    }
}
