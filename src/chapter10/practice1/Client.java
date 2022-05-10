package chapter10.practice1;

public class Client {

	public static void main(String[] args) {
		BasicEMailContent simple = new BasicEMailContent("Hello");
		System.out.println(simple.getContent());
		ExternalEMailContent external = new ExternalEMailContent(simple);
		System.out.println(external.getContent());
		SecureEMailContent secure = new SecureEMailContent(simple);
		System.out.println(secure.getContent());
	}

}
