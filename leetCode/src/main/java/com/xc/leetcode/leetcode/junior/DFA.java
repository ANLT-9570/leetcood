package com.xc.leetcode.leetcode.junior;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DFA {

    static Map<String,Object> master;

    private static void readFile(String pathname) throws IOException {
        File file = new File(pathname);
//        File file = new File("D:\\mgck-master\\a.txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));

        Set<String> strings = new HashSet<>();
        Set<String> size = new HashSet<>();
        String line = null;
        while ((line = br.readLine()) != null){
            if(isEmpty(line)){
                System.out.println(line);
                strings.add(line);
                size.add(line.charAt(0)+"");
            }
        }
        createSensitiveWordsTree(strings,size.size());
    }

    private static void NIOZeroCope() throws IOException {
        File file = new File("D:\\mgck-master\\others.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        FileChannel channel = raf.getChannel();
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("", 1234));
        channel.transferTo(0, channel.size(), socketChannel);
    }

    @SuppressWarnings("resource")
    private static void NIOZeroCope2(String fromPath,String toPath) throws IOException {
        FileChannel fromChannel = new RandomAccessFile(fromPath, "rw").getChannel();
        FileChannel toChannel = new RandomAccessFile(toPath, "rw").getChannel();

        fromChannel.transferTo(0, fromChannel.size(), toChannel);
        fromChannel.close();
        toChannel.close();
    }
    private static boolean isEmpty(String str){
        return str != null && !"".equals(str);
    }

    //创建敏感词典树
    private static void createSensitiveWordsTree(Set<String> strings,int size){
        if(strings.size() == 0){
            return;
        }

        master = new HashMap<>(size);

        Map<String,Object> temp = master;

        Map<String,Object> flagMap;

        for(String str:strings){

            for (int i = 0; i < str.length(); i++) {

                Object obj = temp.get(str.charAt(i)+"");

                if(obj == null){//key不存在
                    flagMap = new HashMap<>();
                    flagMap.put("isEnd", "0");//不是最后一个

                    temp.put(str.charAt(i)+"", flagMap);
                    temp = flagMap;
                }else{
                    //存在
                    temp = (Map) obj;
                }
                if(i == str.length()-1){
                    temp.put("isEnd", "1");//是最后一个
                }
            }
            temp = master;
        }
        System.out.println(master.size());


    }

    //获取敏感词汇
    private static Set<String> getSensitiveWords(String str){
        //返回的敏感词汇
        Set<String> strings = new HashSet<>();
        //
        Map<String,Object> map = master;

        StringBuilder sensitiveWord = new StringBuilder();
        //遍历输入的词汇
        for (int i = 0; i < str.length(); i++) {

            String key = str.charAt(i)+"";
            //获取是否存在该词汇
            Object obj = map.get(key);

            if(obj != null){
                map = (Map) obj;
                sensitiveWord.append(key);
                if(map.get("isEnd").equals("1")){
                    strings.add(sensitiveWord.toString());
                    sensitiveWord = new StringBuilder();
                    map = master;
                }
            }else{
                //解决连着的敏感词汇如--->淫淫叫
                Object newObj = master.get(key);
                sensitiveWord = new StringBuilder();
                if(newObj == null){
                    map = master;
                }else{
                    sensitiveWord.append(key);
                    map = (Map) newObj;
                }
            }

        }
        return strings;
    }

    //检查文字中是否包含敏感词
    private static void checkSensitiveWords(String str){

    }

    public static void main(String[] args) throws IOException {

//        readFile("D:\\mgck-master\\others.txt");
//        NIOZeroCope2("D:\\mgck-master\\a.txt","D:\\mgck-master\\c.txt");
        long begin = System.currentTimeMillis();
//        Set<String> sensitiveWords = getSensitiveWords("10010 diedjfhsa a萨法放" +
//                "把水八点 可视对讲啊哈自行车科技 第一夫人 dpp"+
//                "太多的伤感情怀也许只局限于饲养基地 荧幕中的情节，主Bitch人公尝试着去用某种方式渐渐的很潇洒地释自杀指南怀那些自己经历的伤感。"+
//                "然后法.轮.功 我们的扮演的角色就是跟随着主人公的喜红客联盟 怒哀乐而过于牵强的把自己的情感也附加于银幕情节中，然后感动就流泪，"+
//                "难过就躺在某一个人的怀里尽情的阐述心扉或者手机卡复制器一个人一杯红酒一部电影在夜三.级.片 深人静的晚上，关上电话静静的发呆着。");
        long end = System.currentTimeMillis();

        readFile("D:\\mgck-master\\色情词库.txt");
        long begin2 = System.currentTimeMillis();
        Set<String> sensitiveWords2 = getSensitiveWords("你一一一一ye情你4淫欲仙欲死淫淫叫崔九贞穿了，成了宅斗文里个言听计从、被人卖了还替人数钱的脑瘫炮灰。\n" +
                "　　所谓活着密穴给渣主角铺路，死后给配角让路。\n" +
                "　　最后落得声名狼藉，一卷草席草草下葬的结局。\n" +
                "　　看完剧情的崔九贞：\n" +
                "　　这辈子没这么无语过！\n" +
                "　　脑瘫炮灰谁爱当谁当，她可不伺候！\n" +
                "　　渣女主喜欢茶言茶语，那就揍得她开不ssssm女王sm女王了口。\n" +
                "　　渣男主喜欢幽会小姨子，那就让大家好好观赏观赏。\n" +
                "　　这个男主不行，那就换一个。\n" +
                "　　某日，崔九贞醉眼朦胧地看着背对着她，矜贵内敛，身姿如玉的人，她慢悠悠地斜躺在榻上，勾了勾红唇。\n" +
                "　　“……想不想姐姐疼你，爱你，命都都给你啊？”\n" +
                "　　临窗而立的男人眸色倏地转深。\n" +
                "　　一句话简介：扶我起来，我还能撩！");
        long end2 = System.currentTimeMillis();

        Set<String> sensitiveWords3 = getSensitiveWords("大公司");
        Set<String> sensitiveWords4 = getSensitiveWords("规范");
        Set<String> sensitiveWords5 = getSensitiveWords("让他");

        System.out.println(sensitiveWords2);
        System.out.println(end2-begin2);

//        System.out.println(end-begin);
    }

}
