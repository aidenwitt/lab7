public class SickPerson extends Person {

	/**
	 * severity of the patient's illness depicted as an int (higher number, more severe).
	 */
	private int severity;
	
	/**
	 * constructor for a SickPerson
	 * @param name, name of patient
	 * @param age, patient's age
	 * @param severity, severity of the patients illness (as an int)
	 */
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		this.severity = severity;
	}
	
	/**
	 * follows the structure of the compareTo() method. returns 0 automatically if the person 'p' is not a SickPerson.
	 */
	@Override
	protected int compareToImpl(Person p) {
		if (p instanceof SickPerson) {
			if (((SickPerson) p).severity > (this.severity)) {
				return 1;
			}
			else if (((SickPerson) p).severity < (this.severity)){
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
	
	/**
	 * returns a string comprised of the superclass' toString() method and the String "Severity level (severity)".
	 * Follows the format "(superclass' toString()) Severity level (severity)".
	 */
	@Override
	public String toString() {
		return String.format("%s Severity level %d", super.toString(), severity);
	}
	
}
