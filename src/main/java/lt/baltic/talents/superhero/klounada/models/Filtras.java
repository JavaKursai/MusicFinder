package lt.baltic.talents.superhero.klounada.models;

public class Filtras {
	private String inputText;
	private int inputInt;
	
	public Filtras() {
		
	}
	
	public Filtras(String inputText) {
		this.inputText = inputText;
	}

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText, int inputInt) {
		this.inputText = inputText;
		this.inputInt = inputInt;
	}

	public int getInputInt() {
		return inputInt;
	}
	
	
}
