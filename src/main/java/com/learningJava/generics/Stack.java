package com.learningJava.generics;

import java.util.EmptyStackException;

public class Stack<T> {
    ListNode head;
    int size;

    Stack () {
        head = new ListNode(null, null);
        size = 0;
    }

    public void push (T data) {
        ListNode listNode = new ListNode(data, head.next);
        head.next = listNode;
        size++;
    }

    public T pop () throws EmptyStackException {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T value = head.next.data;
        head.next = head.next.next;
        size--;
        return value;
    }

    public T peek () throws EmptyStackException {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return head.next.data;
    }

    private class ListNode {
        public ListNode next;
        public T data;

        ListNode (T data, ListNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
