import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType> {

	/**
	 * uses a PriorityQueue to store patients, not fully initialized until the constructor is called.
	 */
	PriorityQueue<PatientType> patients;
	
	/**
	 * constructor, initialized the PriorityQueue
	 */
	public PriorityQueueHospital() {
		patients = new PriorityQueue<PatientType>();
	}
	
	/**
	 * adds the given patient to the PriorityQueue
	 */
	@Override
	public void addPatient(PatientType patient) {
		patients.add(patient);
	}

	/**
	 * Looks at the next patient in the PriorityQueue without removing it.
	 */
	@Override
	public PatientType nextPatient() {
		return patients.peek();
	}

	/**
	 * removes the next patient from the PriorityQueue (assuming the patient is looked after and discharged)
	 */
	@Override
	public PatientType treatNextPatient() {
		return patients.poll();
	}

	/**
	 * returns the number of patients in the PriorityQueue
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
		return "PriorityQueueHospital";
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
