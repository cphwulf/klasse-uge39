package hundekennel;
public class Owner {
	private String navn;
	private String email;
	private String role;

	public Owner(String navn, String role) {
		this.navn = navn;
		this.role = role;
	}

	public String getName() {
		return this.navn;
	}
	public String getRole() {
		return this.role;
	}
	
}
