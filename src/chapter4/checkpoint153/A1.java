package chapter4.checkpoint153;

public class A1 {

	public void doA1() {
		System.out.println("A1 : doA1()");
		A2 a2 = new A2();
		a2.doA2(this);
	}

	public void doit(A3 a3) {
		System.out.println("A1 : doit(A3)");
		a3.doit();
	}
}
