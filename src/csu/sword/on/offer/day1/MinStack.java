package csu.sword.on.offer.day1;

import java.util.Stack;

class MinStack {

    /**
     * 主栈
     */
    Stack<Integer> mainStack;
    /**
     * 辅助栈
     */
    Stack<Integer> wingman;
    /**
     * 最小值计数
     */
    int minNum;

    /** initialize your data structure here. */
    public MinStack() {
        mainStack = new Stack<>();
        wingman   = new Stack<>();
        minNum = 2147483647;
    }

    public void push(int x) {
        mainStack.push(x);
        if (minNum >= x) {
            minNum = x;
            wingman.push(minNum);
        }
    }

    public void pop() {
        if(mainStack.peek().equals(wingman.peek())) {
            wingman.pop();
            // 这里必须要将minNum重置
            if (wingman.empty()) {
                minNum = 2147483647;
            } else {
                minNum = wingman.peek();
            }
        }
        mainStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int min() {
        return wingman.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */