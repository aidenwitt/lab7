import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType> {

	/**
	 * uses stack to store patients, not fully initialized until the constructor is called.
	 */
	Stack<PatientType> patients;
	
	/**
	 * constructor, initialized the stack
	 */
	public StackHospital() {
		patients = new Stack<PatientType>();
	}
	
	/**
	 * adds the given patient to the stack
	 */
	@Override
	public void addPatient(PatientType patient) {
		patients.push(patient);
	}

	/**
	 * Looks at the next patient in the stack without removing it.
	 */
	@Override
	public PatientType nextPatient() {
		return patients.peek();
	}

	/**
	 * removes the next patient from the stack (assuming the patient is looked after and discharged)
	 */
	@Override
	public PatientType treatNextPatient() {
		return patients.pop();
	}
	
	/**
	 * returns the number of patients in the stack
	 */
	@Override
	public int numPatients() {
		return patients.size();
	}
	
	/**
	 * returns the classname
	 */
	@Override
	public String hospitalType() {
		return "StackHospital";
	}

	/**
	 * uses an advanced for loop to return a single String comprised of all the toString() calls of the individual patients connected to each other.
	 */
	@Override
	public String allPatientInfo() {
		String returner = "";
		for (PatientType patient : patients) {
			returner += patient.toString();
		}
		return returner;
	}

	


}
