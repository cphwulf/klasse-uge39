import java.util.ArrayList;
public class Person {
	String navn;
	int telefonnr;
	ArrayList<Hund> mineHunde;

	public Person(String navn) {
		this.navn = navn;
		//ArrayList<Hund> mineHunde = new ArrayList();
		this.mineHunde = new ArrayList<Hund>();
	}

	public String getNavn() {
		return this.navn;
	}

	public void setHund(Hund denneHund) {
		mineHunde.add(denneHund);
	}

	public ArrayList<Hund> getMineHunde() {
		return this.mineHunde;
	}
	
}
