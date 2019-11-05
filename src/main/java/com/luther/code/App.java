package com.luther.code;

import com.alibaba.fastjson.JSONObject;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        JSONObject js = new JSONObject();
        js.put("aaa", "asdasd");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                js.put("asdasd", "adasdad");
                countDownLatch.countDown();
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        countDownLatch.await(11, TimeUnit.SECONDS);

        System.out.println("Hello World!");
    }
}
