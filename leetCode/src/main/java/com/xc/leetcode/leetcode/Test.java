package com.xc.leetcode.leetcode;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

    //而ａ＆ｂ或者ａ｜ｂ则是二进制的与或运算

    //＆同为１时为１，否则为０（与）

    //｜同为０时为０，否则为１（或）
//    位异或运算（^）
//
//    运算规则是：两个数转为二进制，然后从高位开始比较，如果相同则为0，不相同则为1。
//
//    比如：8^11.
//    位非运算符（~）
//
//    运算规则：如果位为0，结果是1，如果位为1，结果是0.

//        <<      :     左移运算符，num << 1,相当于num乘以2
//
//        >>      :     右移运算符，num >> 1,相当于num除以2
//
//        >>>    :     无符号右移，忽略符号位，空位都以0补齐逻辑右移，当num为正数和算术右移一个效果
    //３＆５则
    //　００１１
    //＆０１０１
    //　０００１
    //        等于１
    //
    //３｜５则
    //　００１１
    //｜０１０１
    //　０１１１
    //        等于７

        System.out.println(10<<3);
        System.out.println(10&1);
        System.out.println(-10>>>2);
        System.out.println(60&15);
        System.out.println(6&7);
        System.out.println(6%8);
        System.out.println('8'-'1');
        System.out.println("");
        System.out.println(1/3);
        System.out.println(1<<5);
        System.out.println(6<<3);
        System.out.println(Integer.toBinaryString(6<<3));
        System.out.println(Integer.toBinaryString(6));

        System.out.println(6^2);
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer orDefault = map.getOrDefault(1, 0);
        map.put(1, map.getOrDefault(1, 0)+1);
        System.out.println(orDefault);
        map.put(1, 1);
        map.put(2, 2);
        Integer orDefault2 = map.getOrDefault(2, 0);
        System.out.println(orDefault2);
        map.forEach((k,v)->System.out.println(k+"---"+v));

        System.out.println("------------");
        System.out.println(1%10);
        System.out.println("------------");

        int r = 5;
        int c = 6;
        System.out.println(r/3*3+c/3);
        System.out.println(r/3+c/3);
        System.out.println(r+c/3);
        System.out.println(r/3*3);
        System.out.println(r/3);
        System.out.println("------------");
        System.out.println(1<<6);
        System.out.println(64&384);
        System.out.println(1<<7);
        System.out.println(1<<8);
        System.out.println(256&128);
        System.out.println(128|256);
    }
}
