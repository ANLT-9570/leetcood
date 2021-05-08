package com.xc.leetcode.leetcode;

import com.xc.leetcode.leetcode.junior.TrieTree;

import java.util.HashMap;
import java.util.Set;

public class TrieTreeTest {
    public static void main(String[] args) {
        TrieTree trie = new TrieTree();
        trie.insert("I");
        trie.insert("Love");
        trie.insert("China");
        trie.insert("China");
        trie.insert("China");
        trie.insert("China");
        trie.insert("China");
        trie.insert("xiaoliang");
        trie.insert("xiaoliang");
        trie.insert("man");
        trie.insert("handsome");
        trie.insert("love");
        trie.insert("chinaha");
        trie.insert("her");
        trie.insert("know");
        trie.insert("caiNiao");

        trie.isExist("k");

        HashMap<String, Integer> allWords = trie.getAllWords();
        allWords = trie.getWordsForPrefix("ca");
        Set<String> keySet = allWords.keySet();

        for(String s:keySet){
            Integer integer = allWords.get(s);
            System.out.println("key："+s+"--->次数："+integer);
        }

    }
}
