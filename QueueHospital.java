import java.util.LinkedList;

public class QueueHospital<PatientType> extends Hospital<PatientType>{

	/**
	 * uses a LinkedList to store patients, not fully initialized until the constructor is called.
	 */
	LinkedList<PatientType> patients;
	
	/**
	 * constructor, initialized the LinkedList
	 */
	public QueueHospital() {
		patients = new LinkedList<PatientType>();
	}
	
	/**
	 * adds the given patient to the LinkedList
	 */
	@Override
	public void addPatient(PatientType patient) {
		patients.add(patient);
	}

	/**
	 * Looks at the next patient in the LinkedList without removing it.
	 */
	@Override
	public PatientType nextPatient() {
		return patients.peek();
	}

	/**
	 * removes the next patient from the LinkedList (assuming the patient is looked after and discharged)
	 */
	@Override
	public PatientType treatNextPatient() {
		return patients.pop();
	}

	/**
	 * returns the number of patients in the LinkedList
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
		return "QueueHospital";
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
