package Text;

import java.util.ArrayList;
import java.util.List;


public class Sentence{
	private List<PartOfSentence> sentence;
	
	public Sentence() {
		sentence = new ArrayList<PartOfSentence>();
	}
	
	public void add (PartOfSentence partOfSentence) {
		sentence.add(partOfSentence);
	}
	
	public List<PartOfSentence> getSentence() {
		return sentence;
	}

	public void setSentence(List<PartOfSentence> sentence) {
		this.sentence = sentence;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sentence == null) ? 0 : sentence.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sentence other = (Sentence) obj;
		if (sentence == null) {
			if (other.sentence != null)
				return false;
		} else if (!sentence.equals(other.sentence))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sentence [sentence=" + sentence + "]";
	}
	
	
	
	
}
