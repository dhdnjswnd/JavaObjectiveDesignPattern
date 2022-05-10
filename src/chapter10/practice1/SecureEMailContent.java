package chapter10.practice1;

public class SecureEMailContent extends EMailDecorator {

	public SecureEMailContent(EMailContent emailContent) {
		super(emailContent);
		// TODO Auto-generated constructor stub
	}

	public String getContent() {
		return encrypt(super.getContent());

	}

	private String encrypt(String content) {
		return content + " Encrypted.";
	}
}
