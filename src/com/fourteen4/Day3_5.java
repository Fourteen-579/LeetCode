//package com.fourteen4;
//
//import java.util.Stack;
//
//public class Day3_5 {
//}
//
//class MyQueue {
//
//    Stack<Integer> stackButton;
//    Stack<Integer> stackTop;
//
//    /** Initialize your data structure here. */
//    public MyQueue() {
//        this.stackButton = new Stack<>();
//        this.stackTop = new Stack<>();
//    }
//
//    /** Push element x to the back of queue. */
//    public void push(int x) {
//        stackButton.push(x);
//    }
//
//    /** Removes the element from in front of queue and returns that element. */
//    public int pop() {
//        if(stackTop.empty()){
//            while(!stackButton.empty()){
//                stackTop.push(stackButton.pop());
//            }
//        }
//        return stackTop.pop();
//    }
//
//    /** Get the front element. */
//    public int peek() {
//        if(stackTop.empty()){
//            while(!stackButton.empty()){
//                stackTop.push(stackButton.pop());
//            }
//        }
//        return stackTop.peek();
//    }
//
//    /** Returns whether the queue is empty. */
//    public boolean empty() {
//        return stackTop.empty()&&stackButton.empty();
//    }
//}
