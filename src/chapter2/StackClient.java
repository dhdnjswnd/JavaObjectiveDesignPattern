package chapter2;

public class StackClient {
	public static void main(String[] args) {
		ArrayStack st = new ArrayStack(10);
		st.push(20);
		System.out.println(st.peek());
		System.out.println(st.itemArray.get(st.itemArray.size() - 1));
	
	}
}
