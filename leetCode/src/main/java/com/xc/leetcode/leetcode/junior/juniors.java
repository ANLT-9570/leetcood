package com.xc.leetcode.leetcode.junior;

import java.util.*;

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
        System.out.println("两个数组的交集 II ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();
        int [] nums1 = {4,9,5,9}, nums2 = {9,4,9,8,4};
//        int [] array3 = {-1,-100,3,99};
        intersect(nums1,nums2);
        System.out.println("两个数组的交集 II ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        intersect2(nums1,nums2);
        System.out.println();

        System.out.println("加一II ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();
        int [] plusOne = {1,2,3,4};
        plusOne2(plusOne);
        int [] plusOne2 = {8,9,9,9};
        plusOne2(plusOne2);
        int [] plusOne3 = {9,9,9,9};
        plusOne2(plusOne3);

        int [] plusOne4 = {7,9,3,9};
        plusOne2(plusOne4);

        int [] plusOne5 = {9};
        plusOne2(plusOne5);

        System.out.println("移动0 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();
        int [] nums = {0,1,0,3,12};
        int [] nums22 = {0,1,0,3,12};
        int [] nums33 = {0,1,0,3,12};
        int [] nums44 = {0,1,0,3,12};
        moveZeroes(nums);
        moveZeroes2(nums22);
        moveZeroes3(nums33);
        moveZeroes4(nums44);

        System.out.println("两数之和 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println();
        int [] twoSum = {2,11,15,7};
        int target = 9;
        int[] ints = twoSum(twoSum, target);
        System.out.println(Arrays.toString(ints));
        int[] ints2 = twoSum2(twoSum, target);
        System.out.println(Arrays.toString(ints2));
        int[] ints3 = twoSum3(twoSum, target);
        System.out.println(Arrays.toString(ints3));

        System.out.println("有效的数独 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        char [][] board = new char[][]
                {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','5','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'5','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
        char [][] board2 = new char[][]
                {{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board2));
        System.out.println(isValidSudoku3(board));


        System.out.println("旋转图像 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        int [][] matrix = new int[][]{
                                    {1,2,3},
                                    {4,5,6},
                                    {7,8,9}
                                        };
        rotate1(matrix);

        int [][] matrix6 = new int[][]{
                {21,22,23,10,41,50},
                {24,25,26,11,42,51},
                {27,28,29,12,43,52},
                {33,34,35,36,44,53},
                {45,46,47,48,49,54},
                {55,56,57,58,59,60},
        };
        for (int i = 0; i < 2; i++) {
            rotate1(matrix6);
            System.out.println();
        }
        System.out.println("反转字符串 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");

        char [] s = new char[]{'h','e','l','l','o'};
        reverseString(s);

        System.out.println("整数反转 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
        System.out.println(1534236469);
        System.out.println(reverse(1534236469));

        System.out.println("字符串中的第一个唯一字符 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar2("leetcode"));
        System.out.println(firstUniqChar2("loveleetcode"));

        //有效的字母异位词
        System.out.println("有效的字母异位词 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
        System.out.println(isAnagram("ab","a"));
        System.out.println(isAnagram("aa","bb"));
        System.out.println(isAnagram("aacc","ccac"));
        System.out.println(isAnagram2("aacc","ccac"));


        //验证回文串
        System.out.println("验证回文串 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));

        //字符串转换整数
        System.out.println("字符串转换整数 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("words and 987"));
        System.out.println(myAtoi("-91283472332"));
        System.out.println(myAtoi("3.1415926"));
        System.out.println(myAtoi(""));
        System.out.println(myAtoi("-"));
        System.out.println(myAtoi("+1"));
        System.out.println(myAtoi("-+21"));
        System.out.println(myAtoi("20000000000000000000"));
        System.out.println(myAtoi("21474836460"));
        System.out.println("---------------------------------");
        System.out.println(myAtoi2("42"));
        System.out.println(myAtoi2("   -42"));
        System.out.println(myAtoi2("4193 with words"));
        System.out.println(myAtoi2("words and 987"));
        System.out.println(myAtoi2("-91283472332"));
        System.out.println(myAtoi2("3.1415926"));
        System.out.println(myAtoi2(""));
        System.out.println(myAtoi2("-"));
        System.out.println(myAtoi2("+1"));
        System.out.println(myAtoi2("-+21"));
        System.out.println(myAtoi2("20000000000000000000"));
        System.out.println(myAtoi2("21474836460"));

        //字符串转换整数
        System.out.println("实现 strStr() ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
        System.out.println(" ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
//        给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
//        当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
//
//        对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
//
//        示例 1：
//
//        输入：haystack = "hello", needle = "ll"
//        输出：2
//        示例 2：
//
//        输入：haystack = "aaaaa", needle = "bba"
//        输出：-1
//        示例 3：
//
//        输入：haystack = "", needle = ""
//        输出：0

        int i = strStr("hello", "ll");
        System.out.println(i);

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

/*
    两个数组的交集 II

    给定两个数组，编写一个函数来计算它们的交集。

    示例 1：

    输入：nums1 = [1,2,2,1], nums2 = [2,2]
    输出：[2,2]
    示例 2:

    输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
    输出：[4,9]      

    说明：

    输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
    我们可以不考虑输出结果的顺序。
    进阶：

    如果给定的数组已经排好序呢？你将如何优化你的算法？
    如果 nums1 的大小比 nums2 小很多，哪种方法更优？
    如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？*/

    private static void intersect(int[] nums1, int[] nums2){
//        输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        输出：[4,9]
        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i :nums1) {
            linkedHashMap.put(i, linkedHashMap.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int temp;
        for (int i :nums2) {
            if(linkedHashMap.get(i) != null && (temp=linkedHashMap.get(i))>0){
                System.out.print(i+" ");
                linkedHashMap.put(i,--temp);
            }
        }
        System.out.println();
    }
    private static void intersect2(int[] nums1, int[] nums2){
//        输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        输出：[4,9]

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0,j=0; i < nums1.length && j < nums2.length;) {
            int id = nums1[i];
            int jd = nums2[j];
            if(id<jd){
                i++;
            }else if(id > jd){
                j++;
            }else {
                arrayList.add(id);
                System.out.print(id+" ");
                i++;
                j++;
            }
        }
        System.out.println(arrayList);
    }

    /*加一
    给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

    最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

    你可以假设除了整数 0 之外，这个整数不会以零开头。

    示例 1：

    输入：digits = [1,2,3]
    输出：[1,2,4]
    解释：输入数组表示数字 123。
    示例 2：

    输入：digits = [4,3,2,1]
    输出：[4,3,2,2]
    解释：输入数组表示数字 4321。
    示例 3：

    输入：digits = [0]
    输出：[1]*/
    private static void plusOne(int[] digits){
        int tempNum = 0;
        for (int i = digits.length-1; i >= 0; i--) {
            Integer num = digits[i];
            if(digits.length-1 == i){
                if(num+1>9){
                    tempNum = 1;
                    num =0;
                    if(i == 0){
                        digits = resize(digits);
                        break;
                    }
                }else{
                    num = num + 1;
                }
            }else{
                if(num + tempNum > 9){
                    num = 0;
                    tempNum = 1;
                    if(i == 0){
                        digits = resize(digits);
                        break;
                    }
                }else{
                    num = num + tempNum;
                    tempNum = 0;
                }
            }
            digits[i] = num ;
        }
        foreach(digits);
        System.out.println();
    }

    private static int [] resize(int[] digits){
        int [] temp = new int[digits.length+1];
        for (int i = 0; i < digits.length; i++) {
            temp[i] = digits[i];
            if(i == 0){
                temp[i] = 0;
            }
        }
        temp[0] = 1;
        return temp;
    }

    private static void plusOne2(int[] digits){
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] != 9){
                digits[i] ++;
                System.out.println();
                foreach(digits);
                return;
            }
            digits[i] = 0;
        }
        int temp [] = new int[digits.length+1];
        temp[0] = 1;
        System.out.println();
        foreach(temp);
    }

/*    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

    示例:

    输入: [0,1,0,3,12]
    输出: [1,3,12,0,0]
    说明:
    必须在原数组上操作，不能拷贝额外的数组。
    尽量减少操作次数。*/
    private static void moveZeroes(int[] nums){
        int q = 1;
        for (int i = 0; i <nums.length; i++) {
            if(nums[i] == 0){

                for (int j = i+1; j < nums.length; j++) {
                    if(nums[j]!=0){
                        q = nums[i];
                        nums[i] = nums[j];
                        nums[j] = q;
                        break;
                    }
                }
            }
        }
        System.out.println();
        foreach(nums);
    }

    private static void moveZeroes2(int[] nums){
        int q = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[q++] = nums[i];
            }
        }
        while (q<nums.length){
            nums[q++] = 0;
        }
        System.out.println();
        foreach(nums);
    }

    private static void moveZeroes3(int[] nums){
        int q = 0;//记录0的个数
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                q++;
            }else{
                nums[i-q] = nums[i];
                nums[i] = 0;
            }
        }
        System.out.println();
        foreach(nums);
    }

    private static void moveZeroes4(int[] nums){
        int q = 0;//记录0的个数
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                int temp = nums[q];
                nums[q] = nums[i];
                nums[i] = temp;
                q++;
            }
        }
        System.out.println();
        foreach(nums);
    }

/*    两数之和
    给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。

    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

    你可以按任意顺序返回答案。

             

    示例 1：

    输入：nums = [2,7,11,15], target = 9
    输出：[0,1]
    解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    示例 2：

    输入：nums = [3,2,4], target = 6
    输出：[1,2]
    示例 3：

    输入：nums = [3,3], target = 6
    输出：[0,1]*/
    private static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    System.out.println(i+"-"+j);
                    return new int[]{i,j};
                }
            }
        }
        return nums;
    }
    private static int[] twoSum2(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(target-nums[i]) != null){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        return nums;
    }
    private static int[] twoSum3(int[] nums, int target){
        int i = 0;
        int j = 1;
        int len = nums.length-1;
        while (nums[i] + nums[j] != target){
            if(j == len){
                i++;
                j = i;
            }
            j++;
        }
        return new int[]{i,j};
    }
/*    有效的数独
    请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。

    数字 1-9 在每一行只能出现一次。
    数字 1-9 在每一列只能出现一次。
    数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
    数独部分空格内已填入了数字，空白格用 '.' 表示。

    注意：

    一个有效的数独（部分已被填充）不一定是可解的。
    只需要根据以上规则，验证已经填入的数字是否有效即可。*/
    private static boolean isValidSudoku(char[][] board){
        int length = board.length;
        int [][] line = new int[length][length];
        int [][] column = new int[length][length];
        int [][] cell = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println(board[i][j]);
                //不是数字直接跳过
                if(board[i][j] == '.'){
                    continue;
                }
                //当前格子的数字
                int num = board[i][j] - '0' - 1;//得出一个0到8之间的数字
                //k是第几个单元格，9宫格数独横着和竖着都是3个单元格
                int box_index = i / 3 * 3 + j / 3;
                //如果当前数字对应的行和列以及单元格，只要一个有数字，说明冲突了，直接返回false。
                //举个例子，如果line[i][num]不等于0，说明第i（i从0开始）行有num这个数字。
                if(line[i][num] != 0 || column[j][num] != 0 || cell[box_index][num] != 0){
                    return false;
                }
                //表示第i行有num这个数字，第j列有num这个数字，对应的单元格内也有num这个数字
                line[i][num] = column[j][num] = cell[box_index][num] = 1;
            }
        }
        return true;
    }

    private static boolean isValidSudoku2(char[][] board){
        int[] line = new int[9];
        int[] column = new int[9];
        int[] cell = new int[9];
        int shift = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                //如果还没有填数字，直接跳过
                if (board[i][j] == '.')
                    continue;
                shift = 1 << (board[i][j] - '0');//
                int k = (i / 3) * 3 + j / 3;
                //如果对应的位置只要有一个大于0，说明有冲突，直接返回false
                //512 & 512 --->512   512 & 128 --->0 与运算
                /*
                *在这里做与运算相同时才会大于0，不同时为0
                * */
                if ((column[i] & shift) > 0 || (line[j] & shift) > 0 || (cell[k] & shift) > 0)
                    return false;
                column[i] |= shift;
                line[j] |= shift;
                cell[k] |= shift;
            }
        }
        return true;
    }

    private static boolean isValidSudoku3(char[][] board){
        int [] row = new int[9];
        int [] cell = new int[9];
        int [] box = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if(val == '.'){
                    continue;
                }
                int box_index = i/3*3+j/3;
                if(row[i] != 0 || cell[j] != 0 || box[box_index] != 0){
                    return false;
                }
                row[i] = board[i][j];
                cell[j] = board[i][j];
                box[box_index] = board[i][j];
            }
        }
        return true;
    }

    /*
            旋转图像
            给定一个 n × n 的二维矩阵 matrix 表示一个图像。请你将图像顺时针旋转 90 度。

            你必须在 原地 旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要 使用另一个矩阵来旋转图像。
    */
    private static void rotate1(int[][] matrix) {
        twoArrayForeach(matrix);
        System.out.println();
        System.out.println("----------------");
        int length = matrix.length;
        for (int i = 0; i < length/2; i++) {
            for (int j = i; j < length-i-1; j++) {
                int m = length-j-1;
                int n = length-i-1;
                int temp = matrix[i][j];

                matrix[i][j] = matrix[m][i];
                matrix[m][i] = matrix[n][m];
                matrix[n][m] = matrix[j][n];
                matrix[j][n] = temp;
            }
        }
        twoArrayForeach(matrix);
    }
    private static void rotate2(int[][] matrix) {

        int length = matrix.length;
        //因为是对称的，只需要计算循环前半行即可
        for (int i = 0; i < length / 2; i++) {
            for (int j = i; j < length - i - 1; j++) {
                int temp = matrix[i][j];
                int m = length - j - 1;
                int n = length - i - 1;
                matrix[i][j] = matrix[m][i];
                matrix[m][i] = matrix[n][m];
                matrix[n][m] = matrix[j][n];
                matrix[j][n] = temp;
            }
        }
    }

//    反转字符串
//    编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
//
//    不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
//
//    你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
//    输入：["h","e","l","l","o"]
//    输出：["o","l","l","e","h"]
    private static void reverseString(char[] s) {
        foreachChar(s);
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
        System.out.println();
        foreachChar(s);
    }

//    给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//
//    如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
//
//    假设环境不允许存储 64 位整数（有符号或无符号）。
//
//    输入：x = 123
//    输出：321
//    示例 2：
//
//    输入：x = -123
//    输出：-321
//    示例 3：
//
//    输入：x = 120
//    输出：21
//    示例 4：
//
//    输入：x = 0
//    输出：0
    private static int reverse(int x) {
        int res = 0;
        while (x!=0){
            int temp = x%10;
            int newRes = res*10 + temp;
            if((newRes/10) != res){
                return 0;
            }
            res = res*10 + temp;
            x /= 10;
        }
        System.out.println((int)res==0);
        return res;
    }

//    给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//    示例：
//
//    s = "leetcode"
//    返回 0
//
//    s = "loveleetcode"
//    返回 2
//    提示：你可以假定该字符串只包含小写字母。
    private static int firstUniqChar(String s) {
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i)+"", map.getOrDefault(s.charAt(i) + "", 0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)+"") == 1){
                return i;
            }
        }
        return -1;
    }

    private static int firstUniqChar2(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.lastIndexOf(s.charAt(i)) == s.indexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }

    private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int [] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            a[t.charAt(i)-'a']--;
        }
        for (int k:a){
            if(k != 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        return Arrays.equals(sChar,tChar);
    }
    private static boolean isAnagram3(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int [] map = new int[26];
        int count = 0;
        for (int i = 0; i < sChar.length; i++) {
            if(++map[sChar[i]-'a'] == 1){
                count++;
            }
            if(--map[tChar[i]-'a'] == 0){
                count--;
            }
        }
        return count == 0;
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;

        while (i<j){
            char begin = s.charAt(i);
            char end = s.charAt(j);
            if(begin <= 47 ||  (begin >= 58 && begin <= 64) || (begin >= 91 && begin <= 96) || (begin >= 123 && begin <= 126)){
                i++;
                continue;
            }
            if(end <= 47 || (end >= 58 && end <= 64) || (end >= 91 && end <= 96) || (end >= 123 && end <= 126)){
                j--;
                continue;
            }
            if(begin != end){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static int myAtoi(String s) {
        s = s.trim();
        String ca = "";
        if(s.equals("")){
            return 0;
        }
        if(s.charAt(0) == '-' ){
            ca = "-";
            s = s.substring(1, s.length());
        }else if(s.charAt(0) == '+' ){
            s = s.substring(1, s.length());
        }
        if(s.equals("") || s.charAt(0) >= 'a' && s.charAt(0) <= 'z' || s.charAt(0) <= ' ' || s.charAt(0) <= 47){
            return 0;
        }
        Long res = 0L;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) <= ' ' || s.charAt(i) <= 47){
                break;
            }
            if(res < -2147483648){
                return -2147483648;
            }else if(res > 2147483647){
                return 2147483647;
            }
            res = res * 10 + Long.valueOf(ca+(s.charAt(i)-48)+"");
        }
        if(res < -2147483648){
            return -2147483648;
        }else if(res > 2147483647){
            return 2147483647;
        }
        return Integer.valueOf(res.toString());
    }
    private static int myAtoi2(String s) {
        s = s.trim();
        if(s.length() == 0){
            return 0;
        }
        int index = 0;
        String ca = "";
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            if(s.charAt(0) == '-'){
                ca = "-";
            }
            index++;
        }
        Long res = 0L;
        for (int i = index;i < s.length(); i++) {
            if(!Character.isDigit(s.charAt(i))){
                break;
            }
            res = res * 10 + Long.valueOf(ca+s.charAt(i));
            if(res < -2147483648){
                return -2147483648;
            }else if(res > 2147483647){
                return 2147483647;
            }
        }
        return Integer.valueOf(res.toString());
    }

    private static int strStr(String haystack, String needle) {

        if("".equals(needle)){
            return 0;
        }

        int next [] = new int[needle.length()];

        getNext3(needle,next);

        int i = 0;
        int j = 0;
        while ( i < haystack.length() && j < needle.length()){
            if(j == -1 || haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                j = next[j];
            }
            if(j == needle.length()){
                return i-j;
            }
        }
        return -1;
    }
    private static void getNext3(String p, int next[]){
        //第0个位置为-1
        next[0] = -1;
        int i = 0;//主串索引
        int j = -1;//字串索引

        while (i < next.length - 1){

            if( j == -1 || p.charAt(i) == p.charAt(j)){
                i++;
                j++;
                next[i] = j;
            }else{
                j = next[j];
            }
        }
    }
    /**
     * 双指针，类似滑动窗口解法
     */
    public int strStr2(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        int slow = 0;
        for (int fast = 0; fast < haystack.length(); fast++) {
            //如果相等，则移动指针；如果不等，则index清零
            if (haystack.charAt(fast) == needle.charAt(slow)) {
                slow++;
                if (slow == needle.length()) {
                    return fast - slow + 1;
                }
            } else if (slow != 0) {
                //回退并且清零slow
                fast = fast - slow;
                slow = 0;
            }

        }
        return -1;
    }

    private static void foreachChar(char [] array){
        for(Object obj:array){
            System.out.print(obj+",");
        }
    }
    private static void foreach(int [] array){
        for(Object obj:array){
            System.out.print(obj+",");
        }
    }
    private static void twoArrayForeach(int [][] array){
        for (int i = 0; i <array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
        }
    }

}
