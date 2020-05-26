/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package dsa.trie;

/**
 * @author rahul.jaiman
 * @version $Id: Trie.java, v 0.1 2020-05-14 17:54 rahul.jaiman Exp $$
 */
public class TrieNode {

    TrieNode[] child = new TrieNode[26];
    int count;

    public TrieNode() {
        this.count = 0;
        for (int i = 0; i < 26; i++) {
            child[i] = null;
        }
    }
}