package chapter1;

public class Professor {
	private Student student;

	public void setStudent(Student student) {
		this.student = student;
		student.setAdvisor(this);
	}

	public void advise() {
		student.adivse("��� ����...");
	}

	public static void main(String[] args) {
		Professor h = new Professor();
		Student jhon = new Student();
		h.setStudent(jhon);
		h.advise();
	}
}
