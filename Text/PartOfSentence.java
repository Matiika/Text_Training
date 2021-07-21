package Text;

public class PartOfSentence {
	String Symbols;

	public PartOfSentence(String symbols) {
		super();
		Symbols = symbols;
	}

	public String getSymbols() {
		return Symbols;
	}

	public void setSymbols(String symbols) {
		Symbols = symbols;
	}

	@Override
	public String toString() {
		return "PartOfSentence [Symbols=" + Symbols + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Symbols == null) ? 0 : Symbols.hashCode());
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
		PartOfSentence other = (PartOfSentence) obj;
		if (Symbols == null) {
			if (other.Symbols != null)
				return false;
		} else if (!Symbols.equals(other.Symbols))
			return false;
		return true;
	}
	
	
	
	
	
}
