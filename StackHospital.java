import java.util.Stack;

public class StackHospital<PatientType> extends Hospital<PatientType> {

	Stack<PatientType> patients;
	
	public StackHospital() {
		patients = new Stack<PatientType>();
	}
	
	@Override
	public void addPatient(PatientType patient) {
		patients.push(patient);
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
		return "StackHospital";
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
