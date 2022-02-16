package chapter4.checkpoint153;

public class A2 {
	public void doA2(A1 a1) {
		System.out.println("A2 : doA2()");
		A3 a3 = new A3();
		a1.doit(a3);
	}
}
