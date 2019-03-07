
public class HealthyPerson extends Person {

	private String reason;
	
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
	}

	@Override
	protected int compareToImpl(Person p) {
		if (p instanceof SickPerson) {
			if (((SickPerson) p).getName().compareTo(this.getName()) > 0) {
				return 1;
			}
			else if (((SickPerson) p).getName().compareTo(this.getName()) < 0){
				return -1;
			}
			else {
				return 0;
			}
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s In for %s", super.toString(), reason);
	}

}
