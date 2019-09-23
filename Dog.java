package hundekennel;
public class Dog {
	private String navn ;
	private int alder;
	private double vægt;
	private double pris;
	private String køn;
	private Owner ejer;
	private boolean isHungry;

	public Dog(String navn, boolean isHungry){
		this.navn = navn;
		this.isHungry = isHungry;
	}

	public Owner getOwner() {
		return this.ejer;
	}
	public void setOwner(Owner myOwner) {
		this.ejer = myOwner;
	}
	public void setAlder(int hundeAlder){
		alder = hundeAlder;
	}
	public int getAlder(){
		return alder;
	}
	public String toString() {
		return "Dog named " + navn;
	}
	public String feedDog() {
		String msg;
		if (this.isHungry) {
			msg = "Feeding " + navn;
			this.isHungry = false;
		} else {
			msg = "Not Feeding "+ navn;
		}
		return msg;
		// hunden skal fodres kun hvis den er sulten
		// hvis den er blevet fodret skal der sættes en attribut-værdi
		// returnér om den er blevet fodret
	}
	
}
