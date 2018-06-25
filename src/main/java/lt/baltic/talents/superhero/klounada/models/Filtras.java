package lt.baltic.talents.superhero.klounada.models;

public class Filtras {
	private String inputText;

	private String inputInt;

	
	public Filtras() {
		
	}
	
	public Filtras(String inputText) {
		this.inputText = inputText;
	}

	public String getInputText() {
		return inputText;
	}

	public void setInputText(String inputText, String inputInt) {
		this.inputText = inputText;
		this.inputInt = inputInt;
	}

	
	public String getInputInt() {
		return inputInt;
	}

	public void setInputInt(String inputInt) {
		this.inputInt = inputInt;
	}

	
	
}
