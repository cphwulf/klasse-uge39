import java.util.ArrayList;
public class HundeBox {
	int id = 0;
	ArrayList<Hund> boxedHunde;

	public HundeBox(int id) {
		this.boxedHunde = new ArrayList<Hund>();
	}

	public void addHund(Hund hund) {
		this.boxedHunde.add(hund);
	}

	public ArrayList<Hund> searchForOlderThan(int age) {
		// testdata så den virker
		Hund h = new Hund("Viggo",6);
		ArrayList<Hund> retValHunde = new ArrayList<Hund>();
		retValHunde.add(h);
		return retValHunde; 
		// initialiser en retur arraylist
		// loop igennem listen
		// tjek alder
		// put i returlist hvis ældre end
	}
 
}
