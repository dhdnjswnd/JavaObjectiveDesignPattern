package chapter1;

public class Student {
	private Professor advisor;
	
	public void setAdvisor(Professor advisor) {
		this.advisor=advisor;
	}
	
	public void adivse(String msg) {
		System.out.println(msg);
	}
}
