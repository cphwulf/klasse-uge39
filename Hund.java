import java.util.ArrayList;
public class Hund {
	private int alder;
	private int id;
	private String navn;

	public Hund(String navn, int alder){
		this.alder = alder;
		this.navn = navn;
		this.id = DogIdSequenceGenerator.nextId();
		
	}

	public int getDogId() {
		return this.id;
	}
	public String getDogNavn() {
		return this.navn;
	}
}
