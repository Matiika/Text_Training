package Text;



public class Logic {
	
	static void add (Sentence sentence, PartOfSentence partOfSentence) {
		sentence.add(partOfSentence);
	}
	
	static void sentenceView (Sentence sentence){
		for (PartOfSentence s: sentence.getSentence()) {
			System.out.print(s.getSymbols());
		}
	}
	
	static void textView (Text text){
		System.out.println("Название текста "+text.getTitle().getSymbols());
		
		for (Sentence s: text.getText()) {
			sentenceView(s);
		}
	}
	

	
}
