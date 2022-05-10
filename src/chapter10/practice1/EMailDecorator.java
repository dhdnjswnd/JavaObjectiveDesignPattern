package chapter10.practice1;

public abstract class EMailDecorator extends EMailContent {
	private EMailContent decoratedEmailContent;

	public EMailDecorator(EMailContent emailContent) {
		this.decoratedEmailContent = emailContent;
	}

	public String getContent() {
		return decoratedEmailContent.getContent();
	}
}
