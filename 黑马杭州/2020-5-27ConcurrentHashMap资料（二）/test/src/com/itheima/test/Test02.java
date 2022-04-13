package com.itheima.test;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test02 {

    public static void main(String[] args) throws Exception {
        Integer[] arr = {2,5,1,8,10};

        Unsafe unsafe = getUnsafe();

        int baseOffset = unsafe.arrayBaseOffset(Integer[].class);//数组的基础偏移量
        int indexScale = unsafe.arrayIndexScale(Integer[].class);//元素的偏移间隔

        //获取
        Object o = unsafe.getObjectVolatile(arr, (2 * indexScale) + baseOffset);//2
        System.out.println(o);

        //设置
        unsafe.putOrderedObject(arr,(2 * indexScale) + baseOffset,100);

        System.out.println(Arrays.toString(arr));

        //cas  -- 拿着2号角标的值，判断是否是1，如果是设置为101，并且返回true
        boolean b = unsafe.compareAndSwapObject(arr, (2 * indexScale) + baseOffset, 100, 101);
        System.out.println(b);
        System.out.println(Arrays.toString(arr));
    }

    public static Unsafe getUnsafe() throws Exception {
        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        return (Unsafe) theUnsafe.get(null);
    }
}

