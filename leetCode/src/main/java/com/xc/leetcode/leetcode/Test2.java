package com.xc.leetcode.leetcode;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Test2 {
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
        int [][] matrix6 = new int[][]{
                {21,22,23,10,41,50},
                {24,25,26,11,42,51},
                {27,28,29,12,43,52},
                {33,34,35,36,44,53},
                {45,46,47,48,49,54},
                {55,56,57,58,59,60},
        };
        int [][] matrix5 = new int[][]{
                {21,22,23,10,41},
                {24,25,26,11,42},
                {27,28,29,12,43},
                {33,34,35,36,44},
                {45,46,47,48,49},
        };
        int [][] matrix4 = new int[][]{
                {21,22,23,10},
                {24,25,26,11},
                {27,28,29,12},
                {33,34,35,36},
        };
        int [][] matrix3 = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        int length = matrix3.length;
//        for (int i = 0; i < length / 2; i++) {
//            for (int j = 0; j < length - i - 1; j++) {
//
//                int m = length - j - 1;
//                int n = length - i - 1;
//                int temp = matrix3[i][j];
//
//                matrix3[i][j] = matrix3[m][i];
//                matrix3[m][i] = matrix3[n][m];
//                matrix3[n][m] = matrix3[j][n];
//                matrix3[j][n] = temp;
//
//            }
//        }

//        twoArrayForeach(matrix3);

        System.out.println(964632435);
        System.out.println(964632435*10);
        System.out.println(-1230%10);
        System.out.println(String.valueOf(-123).length());
        System.out.println();
        System.out.println(3/2);
        System.out.println(6 & 2);
        System.out.println(2 | 4);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYYMMdd");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
        int a = 5-'0'-1;
        System.out.println(a);

        System.out.println(53-48);
        System.out.println(53-'0'-1);
        System.out.println(5-'0');
        System.out.println(2<<3);
        System.out.println(2>>3);
        System.out.println('0');
        System.out.println(1<<10-'0');
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(-38));










    }
    private static void twoArrayForeach(int [][] array){
        for (int i = 0; i <array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        }
    }
}
