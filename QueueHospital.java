import java.util.LinkedList;

public class QueueHospital<PatientType> extends Hospital<PatientType>{

	LinkedList<PatientType> patients;
	
	public QueueHospital() {
		patients = new LinkedList<PatientType>();
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
		return patients.pop();
	}

	@Override
	public int numPatients() {
		return patients.size();
	}

	@Override
	public String hospitalType() {
		return "QueueHospital";
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
