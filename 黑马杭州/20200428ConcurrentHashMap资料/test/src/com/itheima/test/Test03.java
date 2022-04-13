package com.itheima.test;

public class Test03 {

    public static void main(String[] args) throws Exception {
//        Student student = new Student();
//
//        Unsafe unsafe = Student.getUnsafe();
////        unsafe.putObjectVolatile(student,Student.SIZEOFF,100);
//        Object objectVolatile = unsafe.getObjectVolatile(student, Student.SIZEOFF);
//        System.out.println(objectVolatile);
//
//        unsafe.putObjectVolatile(student,Student.SIZEOFF,100);
//
//        unsafe.compareAndSwapObject(student,Student.SIZEOFF,100,500);
//
//        System.out.println(student);

        int scale = 4;
        int i = Integer.numberOfLeadingZeros(scale);
        System.out.println(31 - i);

    }

}
