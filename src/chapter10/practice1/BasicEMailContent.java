package chapter10.practice1;

public class BasicEMailContent extends EMailContent {
	String content;

	public BasicEMailContent(String content) {
		this.content = content;
	}

	@Override
	public String getContent() {
		return content;
	}

}
