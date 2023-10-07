package com.learningJava.generics;

import java.util.EmptyStackException;
import java.util.List;

public class Queue<T> {
    ListNode head;
    ListNode tail;
    int size;

    Queue () {
        head = new ListNode(null, null, null);
        tail = new ListNode(null, null, head);
        head.next = tail;
        size = 0;
    }

    public void enQueue (T data) {
        ListNode listNode = new ListNode(data, head.next, head);
        head.next.prev = listNode;
        head.next = listNode;
        size++;
    }

    public T deQueue () throws EmptyStackException {
        if (size == 0) {
            throw new EmptyStackException();
        }
        T value = tail.prev.data;
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
        size--;
        return value;
    }

    public T peek () throws EmptyStackException {
        if (size == 0) {
            throw new EmptyStackException();
        }
        return tail.prev.data;
    }

    private class ListNode {
        public ListNode next;
        public ListNode prev;
        public T data;

        ListNode (T data, ListNode next, ListNode prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
}