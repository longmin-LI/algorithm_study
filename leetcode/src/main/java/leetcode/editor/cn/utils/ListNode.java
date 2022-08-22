package leetcode.editor.cn.utils;

/**
 * @auhtor llm
 * @data 2022/8/20 18:17
 */
public class ListNode {
    int val;
    public ListNode next;

    public ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}
