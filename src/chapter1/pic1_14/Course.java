package chapter1.pic1_14;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Transcript> transcripts;

	public Course(String name) {
		this.name = name;
		transcripts = new ArrayList<>();
	}

	public void addTranscript(Transcript trans) {
		transcripts.add(trans);
	}

	public void removeTranscript(Transcript trans) {
		if (transcripts.contains(trans))
			transcripts.remove(trans);
	}
}
