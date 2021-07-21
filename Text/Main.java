package Text;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Text text1 = new Text(new Word ("SW"));
		
		Sentence sentence1 = new Sentence();
		Logic.add(sentence1, new Word("Hello "));
		Logic.add(sentence1, new Punctuation(", "));
		Logic.add(sentence1, new Word("there"));
		Logic.add(sentence1, new Punctuation(". "));
		text1.add(sentence1);

		Sentence sentence2 = new Sentence();
		Logic.add(sentence2, new Word("\nGeneral "));
		Logic.add(sentence2, new Word("Kenobi "));
		text1.add(sentence2);
		
		Logic.textView(text1);
		

	}

}
