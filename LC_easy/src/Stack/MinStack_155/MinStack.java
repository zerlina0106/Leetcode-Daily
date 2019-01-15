package Stack.MinStack_155;

import java.util.Stack;

class MinStack {
	int min = Integer.MAX_VALUE;
	Stack<Integer> stack = new Stack<Integer>();
	public void push(int x) {
		// only push the old minimum value when the current
		// minimum value changes after pushing the new value x
		/**
		 * push的时候就把min也放进去，最小的和第二小的放一起，然后最小的是最上面的，pop的时候没了，之后min就是那个了
		 * 由于peek的时候返回的要是X，所以x一定要放在外面，后push进去
		 */
		if(x <= min){
			stack.push(min);
			min=x;
		}
		stack.push(x);
	}

	public void pop() {
		// if pop operation could result in the changing of the current minimum value,
		// pop twice and change the current minimum value to the last minimum value.
		if(stack.pop() == min) min=stack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return min;
	}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */