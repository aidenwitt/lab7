import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestClass {

	@Test
	public void SickTest() {
		SickPerson patient1 = new SickPerson("a", 13, 7);
		SickPerson patient2 = new SickPerson("a", 13, 7);
		SickPerson patient3 = new SickPerson("b", 23, 4);
		SickPerson patient4 = new SickPerson("c", 32, 10);
		
		System.out.println(patient1.toString());
		System.out.println(patient2.toString());
		System.out.println(patient3.toString());
		System.out.println(patient4.toString());
		
		Assert.assertEquals("CompareTo failure", 0, patient1.compareTo(patient2), 0.0001);
		Assert.assertEquals("CompareTo failure", -1, patient1.compareTo(patient3), 0.0001);	
		Assert.assertEquals("CompareTo failure", 1, patient1.compareTo(patient4), 0.0001);	
		Assert.assertEquals("CompareTo failure", 0, patient1.compareTo(new HealthyPerson("f", 50, "loitering")), 0.0001);	
	}
	
	@Test
	public void HealthyTest() {
		HealthyPerson patient1 = new HealthyPerson("c", 13, "visiting");
		HealthyPerson patient2 = new HealthyPerson("c", 13, "visiting");
		HealthyPerson patient3 = new HealthyPerson("d", 30, "dying");
		
		System.out.println(patient1.toString());
		System.out.println(patient2.toString());
		System.out.println(patient3.toString());
		
		Assert.assertEquals("CompareTo failure", 0, patient1.compareTo(patient2), 0.0001);
		Assert.assertEquals("CompareTo failure", 0, patient1.compareTo(new SickPerson("a", 46, 3)), 0.0001);
		Assert.assertEquals("CompareTo failure", 1, patient1.compareTo(patient3), 0.0001);
	}
	
	@Test
	public void PersonTest() {
		//every method has been tested already in SickTest & HealthyTest, except for getAge():
		Person p1 = new HealthyPerson("p1", 16, "loitering");
		Person p2 = new SickPerson("p2", 45, 8);
		
		p1.getAge();
		p2.getAge();
	}
	
	@Test
	public void AnimalTest() {
		Animal fido = new Animal("dog", 2);
		Animal mittens = new Animal("cat", 4);
		Animal gator = new Animal("Alligator", 7);
		
		fido.getBreed();
		mittens.getBreed();
		gator.getBreed();
		
		fido.getAge();
		mittens.getAge();
		gator.getAge();
		
		System.out.println(fido.toString());
		System.out.println(mittens.toString());
		System.out.println(gator.toString());
		
		Assert.assertEquals("CompareTo failure", 2, fido.compareTo(mittens), 0.0001);
		Assert.assertEquals("CompareTo failure", 5, fido.compareTo(gator), 0.0001);
	}
	
	@Test
	public void StackHosTest() {
		StackHospital<Person> stack = new StackHospital<Person>();
		SickPerson patient1 = new SickPerson("s", 13, 7);
		HealthyPerson patient2 = new HealthyPerson("h", 13, "visiting");
	
		stack.addPatient(patient1);
		stack.addPatient(patient2);
		
		System.out.println(stack.allPatientInfo());
		
		System.out.println(stack.numPatients());
		System.out.println(stack.nextPatient());
		stack.treatNextPatient();
		System.out.println(stack.numPatients());
		System.out.println(stack.nextPatient());
		stack.treatNextPatient();
		
		System.out.println(stack.hospitalType());
		
		System.out.println(stack.allPatientInfo());
	}
	
	@Test
	public void QueueHosTest() {
		QueueHospital<Person> queue = new QueueHospital<Person>();
		SickPerson patient1 = new SickPerson("s2", 11, 5);
		HealthyPerson patient2 = new HealthyPerson("h2", 45, "visiting");
	
		queue.addPatient(patient1);
		queue.addPatient(patient2);
		
		System.out.println(queue.allPatientInfo());
		
		System.out.println(queue.numPatients());
		System.out.println(queue.nextPatient());
		queue.treatNextPatient();
		System.out.println(queue.numPatients());
		System.out.println(queue.nextPatient());
		queue.treatNextPatient();
		
		System.out.println(queue.hospitalType());
		
		System.out.println(queue.allPatientInfo());
	}
	
	@Test
	public void PrioQueueHosTest() {
		PriorityQueueHospital<Person> queue = new PriorityQueueHospital<Person>();
		SickPerson patient1 = new SickPerson("s3", 67, 9);
		HealthyPerson patient2 = new HealthyPerson("h3", 85, "visiting");
	
		queue.addPatient(patient1);
		queue.addPatient(patient2);
		
		System.out.println(queue.allPatientInfo());
		
		System.out.println(queue.numPatients());
		System.out.println(queue.nextPatient());
		queue.treatNextPatient();
		System.out.println(queue.numPatients());
		System.out.println(queue.nextPatient());
		queue.treatNextPatient();
		
		System.out.println(queue.hospitalType());
		
		System.out.println(queue.allPatientInfo());
	}
}

