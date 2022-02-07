package chapter2;

import java.util.ArrayList;

public class ArrayStack {
	public int top;
	public ArrayList<Integer> itemArray;
	public int stackSize;

	public ArrayStack(int stackSize) {
		itemArray = new ArrayList<>(stackSize);
		top = -1;
		this.stackSize = stackSize;
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == this.stackSize - 1);
	}

	public void push(int item) {
		if (isFull()) {
			System.out.println("Inserting Fail! Stack is Full");
		} else {
			itemArray.add(item);
			System.out.println("Inserted Item : " + item);
			top++;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Deleting Fail! Array Stack is Empty");
			return -1;
		}
		return itemArray.get(top--);
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Peeking Fail! Array Stack is Empty");
			return -1;
		} else {
			return itemArray.get(top);
		}
	}
}
