public class DogIdSequenceGenerator {
	private static int dogId;
	public static int nextId() {
		return dogId++;
	}
}

