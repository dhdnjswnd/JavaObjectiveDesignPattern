package chapter10.practice1;

public class ExternalEMailContent extends EMailDecorator {

	public ExternalEMailContent(EMailContent emailContent) {
		super(emailContent);
		// TODO Auto-generated constructor stub
	}

	public String getContent() {
		return addDisclaimer(super.getContent());

	}

	private String addDisclaimer(String content) {
		return content + " Company Disclaimer.";
	}
}
