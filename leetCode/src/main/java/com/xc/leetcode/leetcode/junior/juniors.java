package com.xc.leetcode.leetcode.junior;

import java.util.Arrays;

public class juniors {
    public static void main(String[] args) {
        //取模运算
//        其实就是A除以B的余数
//        如果A小于或等于B，其结果是A
//        1%5 = 1,5/6 = 5,
        System.out.println(1%5);//--->1
        System.out.println(12%5);//--->2    12除以5=2，余数是2，即5*2+2=12，所以12%5=2
        System.out.println(7%3);//--->1     7除以3=2，余数是1，即3*2+1=7，所以7%3=1
        System.out.println(3%7);//--->3     3除以7    3小于7所以 3%7 = 3
        System.out.println(5%7);//--->5     5除以7    5小于7所以 5%7 = 5

        System.out.println();
        System.out.println("删除排序数组中的重复项↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();
        int [] array1 = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicateLC(array1);
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("买卖股票的最佳时机 II↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();
        int [] array2 = {7,1,5,3,6,4,6};
//        int [] array2 = {1,2,3,4,5};
//        int [] array2 = {7,6,4,3,1};
        maxProfitLC(array2);
        System.out.println("-------------------------------------------");
        maxProfitMe(array2);
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("旋转数组↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();
        int [] array3 = {1,2,3,4,5,6,7};
//        int [] array3 = {-1,-100,3,99};
        rotate(array3,3);
        System.out.println();
        System.out.println("存在重复元素↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓返回false说明元素有重复");
        System.out.println();
        int [] array4 = {1,2,3,4};
//        int [] array3 = {-1,-100,3,99};
        containsDuplicate(array4);
        System.out.println();
        System.out.println("只出现一次的数字↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();
        int [] array5 = {4,1,2,1,2};
//        int [] array3 = {-1,-100,3,99};
        singleNumber(array5);
    }

    //删除排序数组中的重复项
    //给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
    //不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
//    给定 nums = [0,0,1,1,1,2,2,3,3,4],
//    函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
//    你不需要考虑数组中超出新长度后面的元素。

    /**
     * 解决方法使用快慢指针
     */
    private static void removeDuplicateLC(int [] array){

        int q = 0;
        int p = 1;

        while (p<array.length){
            int qData = array[q];
            int pData = array[p];
            if(pData>qData){
                array[q+1] = array[p];
                q++;
            }
            p++;
        }
        foreach(array);
    }

//    买卖股票的最佳时机 II
//    给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//    设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
//    注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
//    示例 1:
//
//    输入: [7,1,5,3,6,4]
//    输出: 7
//    解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
//                 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
//    示例 2:
//
//    输入: [1,2,3,4,5]
//    输出: 4
//    解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
//                 注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。
//                 因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
//    示例 3:
//
//    输入: [7,6,4,3,1]
//    输出: 0
//    解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
    private static void maxProfitLC(int [] array){

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1){
                if(array[i]<array[i+1]){
                    sum = sum+array[i+1]-array[i];
                }
            }
        }
        System.out.println(sum);
    }

    private static void maxProfitMe(int [] array){

        int sum = 0;

        for (int i = 0; i < array.length; ) {
            if(i != array.length-1){
                if(array[i]<array[i+1]){
                    System.out.println("第"+ (i+1) +"天买入：股票价---->"+array[i]);
                    System.out.println();

                    int temp = array[i+1];
                    int index = i+2;
                    for (int j = i+2; j < array.length; j++,index++) {//
                        if(temp < array[j]){
                            temp = array[j];
                        }else{
                            break;
                        }
                    }
                    if(index > array.length-1){
                        index--;
                        System.out.println("第"+ (index) +"天卖出：股票价---->"+array[index]);
                        System.out.println("利润--->"+(array[index]-array[i]));
                        sum = sum + (array[index]-array[i]);
                        i++;
                        if(index == array.length-1){
                            break;
                        }
                    }else{
                        System.out.println("第"+ (index) +"天卖出：股票价---->"+array[index]);
                        System.out.println("利润--->"+(array[index-1]-array[i]));
                        sum = sum + (array[index-1]-array[i]);
                        i = index;
                    }
                    System.out.println();
                }else{
                    i++;
                }
            }else{
                i++;
            }

        }
        System.out.println();
        System.out.println("总利润--->"+sum);
    }

//    旋转数组
//    给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
//
//    进阶：
//
//    尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
//    你可以使用空间复杂度为 O(1) 的 原地 算法解决这个问题吗？
//             
//
//    示例 1:
//
//    输入: nums = [1,2,3,4,5,6,7], k = 3
//    输出: [5,6,7,1,2,3,4]
//    解释:
//    向右旋转 1 步: [7,1,2,3,4,5,6]
//    向右旋转 2 步: [6,7,1,2,3,4,5]
//    向右旋转 3 步: [5,6,7,1,2,3,4]
//    示例 2:
//
//    输入：nums = [-1,-100,3,99], k = 2
//    输出：[3,99,-1,-100]
//    解释:
//    向右旋转 1 步: [99,-1,-100,3]
//    向右旋转 2 步: [3,99,-1,-100]
    private static void rotate(int [] array,int k){
//        rotate_one(array,k);
        rotate_two(array,k);
        foreach(array);
        System.out.println();
//        System.out.println(1%5);
//        System.out.println(12%5);
//        System.out.println(7%3);
//        System.out.println(3%7);7除以3=2，余数是1，即3*2+1=7，所以7%3=1
//        System.out.println(5%7);12除以5=2，余数是2，即5*2+2=12，所以12%5=2

    }
    private static void rotate_one(int [] array,int k){
        for (int i = 0; i < k; i++) {
            int last = array[array.length-1];
            for (int j = array.length-1; j >= 0; j--) {
                if(j != 0){
                    array[j] = array[j-1];
                }
            }
            array[0] = last;
        }
    }
    private static void rotate_two(int [] array,int k){
        int tempArray [] = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            tempArray[(i + k) % array.length] = array[i];
        }
        System.arraycopy(tempArray, 0, array, 0,array.length);
    }

//    存在重复元素
//    给定一个整数数组，判断是否存在重复元素。
//
//    如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
//
//             
//
//    示例 1:
//
//    输入: [1,2,3,1]
//    输出: true
//    示例 2:
//
//    输入: [1,2,3,4]
//    输出: false
//    示例 3:
//
//    输入: [1,1,1,3,3,4,3,2,4,2]
//    输出: true
    private static void containsDuplicate(int [] array){
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1){
                if(array[i]==array[i+1]){
                    System.out.println(false);
                    return;
                }
            }
        }
        System.out.println(true);
//        HashSet<Integer> set = new HashSet<>();
//        for(int a:array){
//            set.add(a);
//        }
//        System.out.println(set.size() == array.length);
    }

//    只出现一次的数字
//    给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//    说明：
//
//    你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
//
//    示例 1:
//
//    输入: [2,2,1]
//    输出: 1
//    示例 2:
//
//    输入: [4,1,2,1,2]
//    输出: 4

    private static void singleNumber(int [] nums){
        System.out.println(5^5);
        int b = 0;
        for (int a :nums) {
            int c = 1^a;
            System.out.println(b^a);
            System.out.println(c);
            b = b ^ a;
        }
    }

    private static void foreach(int [] array){
        for(Object obj:array){
            System.out.print(obj+",");
        }
    }
}
