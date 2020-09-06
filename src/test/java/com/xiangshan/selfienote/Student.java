//package com.xiangshan.selfienote;
//
//import java.lang.reflect.Field;
//
//public class Student {
//    private String name;
//    public Student(){
//        System.out.println("创建了一个Student实例");
//    }
//
//    public static void main(){
//        Class studentClass = Student.class;
//        Object mStudent = studentClass.newInstance();
//
//        //获取Field类对象
//        Field f = studentClass.getDeclaredField("name");
//        //允许访问私有权限的属性
//        f.setAccessible(true);
//
//        //修改name属性后输出
//        f.set(mStudent, "wxs");
//        System.out.println(f.get(mStudent));
//    }
//}
