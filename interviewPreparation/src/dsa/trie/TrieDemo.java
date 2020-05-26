/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package dsa.trie;

/**
 * @author rahul.jaiman
 * @version $Id: TrieDemo.java, v 0.1 2020-05-14 17:54 rahul.jaiman Exp $$
 */
public class TrieDemo {
    static TrieNode root;


    //this is used to add the word in the trie
    public static void insert(String word) {

        TrieNode pCrawl = root;
        int index = 0;
        for (int level = 0; level < word.length(); level++) {
            index = word.charAt(level) - 'a';
            if (pCrawl.child[index] == null) {
                pCrawl.child[index] = new TrieNode();
            }
            pCrawl = pCrawl.child[index];
        }
        pCrawl.count++;
    }


    //this is used to search the word in the trie
    public static boolean search(String word) {

        int index = 0;
        TrieNode pCrawl = root;
        for (int level = 0; level < word.length(); level++) {
            index = word.charAt(level) - 'a';
            if (pCrawl.child[index] == null) {
                return false;
            }
            pCrawl = pCrawl.child[index];
        }
        return pCrawl != null && pCrawl.count > 0;

    }

    //this is used to find
    public static boolean startsWith(String prefix) {

        if (prefix == null) return true;

        int index = 0;
        TrieNode pCrawl = root;
        for (int level = 0; level < prefix.length(); level++) {
            index = prefix.charAt(level) - 'a';
            if (pCrawl.child[index] == null) {
                return false;
            }
            pCrawl = pCrawl.child[index];
        }
        return pCrawl != null;

    }

    public static void main(String[] args) {
        String[] keys = {"the", "a", "there", "answer", "any",
                "by", "bye", "their"};

        root = new TrieNode();

        for (int i = 0; i < keys.length; i++) {
            insert(keys[i]);
        }

    }
}