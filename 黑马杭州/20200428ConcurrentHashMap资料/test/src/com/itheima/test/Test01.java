package com.itheima.test;


import java.util.concurrent.ConcurrentHashMap;

public class Test01 {
    public static void main(String[] args) throws Exception {
        final ConcurrentHashMap chm = new ConcurrentHashMap();


//        String s = "通话";
//        String s2 = "重地";
//        System.out.println(s.hashCode());
//        System.out.println(s2.hashCode());

        new Thread(){
            @Override
            public void run() {
                chm.put("通话","11");
                System.out.println("-----------");
            }
        }.start();

        Thread.sleep(1000);

        new Thread(){
            @Override
            public void run() {
                chm.put("重地","22");
                System.out.println("===========");
            }
        }.start();
    }

}
