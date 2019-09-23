package hundekennel;
import java.util.Arrays;
public class DogKennel {
	public static void main(String[] args) {
		System.out.println("godmorgen");
		Owner svigerFar = new Owner("Henning", "ejer");
		Dog myDog = new Dog("woodie", true);
		myDog.setOwner(svigerFar);
		System.out.println("min hund er ejet af " + myDog.getOwner().getName());
		Dog myDog2 = new Dog("fido",true);
		Dog myDog3 = new Dog("nuser", true);
		String resString = myDog.feedDog();
		System.out.println(resString);
		resString = myDog.feedDog();
		System.out.println(resString);
		myDog.setAlder(4);
		System.out.println(myDog.getAlder());
		System.out.println(myDog);


	}
	
}
