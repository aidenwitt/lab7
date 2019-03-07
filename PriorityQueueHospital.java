import java.util.PriorityQueue;

public class PriorityQueueHospital<PatientType> extends Hospital<PatientType> {

	PriorityQueue<PatientType> patients;
	
	public PriorityQueueHospital() {
		patients = new PriorityQueue<PatientType>();
	}
	@Override
	public void addPatient(PatientType patient) {
		patients.add(patient);
	}

	@Override
	public PatientType nextPatient() {
		return patients.peek();
	}

	@Override
	public PatientType treatNextPatient() {
		return patients.remove();
	}

	@Override
	public int numPatients() {
		return patients.size();
	}

	@Override
	public String hospitalType() {
		return "PriorityQueueHospital";
	}

	@Override
	public String allPatientInfo() {
		String returner = "";
		for (PatientType patient : patients) {
			returner += patient.toString();
		}
		return returner;
	}

}
