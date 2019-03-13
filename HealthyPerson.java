
public class HealthyPerson extends Person {

	/**
	 * The patients reason for being admitted to the hospital (String)
	 */
	private String reason;
	
	/**
	 * Constructor for a healthy person 
	 * @param name, name of the patient
	 * @param age, patients age
	 * @param reason, reason for admittance
	 */
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
	}

	/** 
	 * Method for sorting Healthy patients, mainly uses compareTo, but also returns 0 when the Person 'p' is not a Healthy Person
	 */
	@Override
	protected int compareToImpl(Person p) {
		if (p instanceof HealthyPerson) {
			return ((HealthyPerson) p).getName().compareTo(this.getName());
		}
		else {
			return 0;
		}
	}
	
	/**
	 * returns a string comprised of the superclass' toString() and the String "In for (reason)".
	 * returns String in format "(Superclass' toString()) In for (reason)".
	 */
	@Override
	public String toString() {
		return String.format("%s In for %s", super.toString(), reason);
	}

}
