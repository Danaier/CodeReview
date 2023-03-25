package csu.sword.on.offer.day1;


import java.util.Stack;

/**
 * 用两个栈实现队列
 */
class CQueue {

    /**
     * 两个栈
     */
    Stack<Integer> l;
    Stack<Integer> r;

    public CQueue() {
        l = new Stack<Integer>();
        r = new Stack<Integer>();
    }

    public void appendTail(int value) {
        l.push(value);
    }

    public int deleteHead() {
        int result = -1;
        if (!l.empty()) {
            while (!l.empty()) {
                r.push(l.pop());
            }
            result = r.pop();
            while (!r.empty()) {
                l.push(r.pop());
            }
        }
        return result;
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */