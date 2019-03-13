import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class test {

	@Test
	public void HealthyTest() {
		Person patient1 = new HealthyPerson("c", 13, "visiting");
		Person patient2 = new HealthyPerson("c", 13, "visiting");
		Person patient3 = new HealthyPerson("d", 30, "dying");
		
		patient1.toString();
		patient2.toString();
		patient3.toString();
		
		Assert.assertEquals("CompareTo failure", 0, patient1.compareTo(patient2), 0.0001);
		Assert.assertEquals("CompareTo failure", 0, patient1.compareTo(new SickPerson("a", 46, 3)), 0.0001);
		Assert.assertEquals("CompareTo failure", 1, patient1.compareTo(patient3), 0.0001);
	}
	
	@Test
	public void SickTest() {
		Person patient1 = new SickPerson("a", 13, 7);
		Person patient2 = new SickPerson("a", 13, 7);
		Person patient3 = new SickPerson("b", 23, 4);
		Person patient4 = new SickPerson("c", 32, 10);
		
		patient1.toString();
		patient2.toString();
		patient3.toString();
		patient4.toString();
		
		Assert.assertEquals("CompareTo failure", 0, patient1.compareTo(patient2), 0.0001);
		Assert.assertEquals("CompareTo failure", -1, patient1.compareTo(patient3), 0.0001);	
		Assert.assertEquals("CompareTo failure", 1, patient1.compareTo(patient4), 0.0001);	
		Assert.assertEquals("CompareTo failure", 0, patient1.compareTo(new HealthyPerson("f", 50, "loitering")), 0.0001);	
	}
	
	@Test
	public void StackHosTest() {
		StackHospital<Person> stack = new StackHospital<Person>();
		Person patient1 = new SickPerson("s", 13, 7);
		Person patient2 = new HealthyPerson("h", 13, "visiting");
	
		stack.addPatient(patient1);
		stack.addPatient(patient2);
		
		stack.allPatientInfo();
		
		Assert.assertEquals("numPatients() failure", 2, stack.numPatients(), 0.0001);
		stack.nextPatient();
		stack.treatNextPatient();
		Assert.assertEquals("numPatients() failure", 1, stack.numPatients(), 0.0001);
		stack.nextPatient();
		stack.treatNextPatient();
		Assert.assertEquals("numPatients() failure", 0, stack.numPatients(), 0.0001);
		
		stack.hospitalType();
		stack.allPatientInfo();
		
		stack.toString();
	}

	@Test
	public void QueueHosTest() {
		QueueHospital<Person> queue = new QueueHospital<Person>();
		Person patient1 = new SickPerson("s2", 11, 5);
		Person patient2 = new HealthyPerson("h2", 45, "visiting");
	
		queue.addPatient(patient1);
		queue.addPatient(patient2);
		
		queue.allPatientInfo();
		
		Assert.assertEquals("numPatients() failure", 2, queue.numPatients(), 0.0001);
		queue.nextPatient();
		queue.treatNextPatient();
		Assert.assertEquals("numPatients() failure", 1, queue.numPatients(), 0.0001);
		queue.nextPatient();
		queue.treatNextPatient();
		Assert.assertEquals("numPatients() failure", 0, queue.numPatients(), 0.0001);
		
		queue.hospitalType();
		queue.allPatientInfo();
		
		queue.toString();
	}
	
	@Test
	public void PrioQueueHosTest() {
		PriorityQueueHospital<Person> pQueue = new PriorityQueueHospital<Person>();
		Person patient1 = new SickPerson("s3", 67, 9);
		Person patient2 = new HealthyPerson("h3", 85, "visiting");
	
		pQueue.addPatient(patient1);
		pQueue.addPatient(patient2);
		
		pQueue.allPatientInfo();
		
		Assert.assertEquals("numPatients() failure", 2, pQueue.numPatients(), 0.0001);
		pQueue.nextPatient();
		pQueue.treatNextPatient();
		Assert.assertEquals("numPatients() failure", 1, pQueue.numPatients(), 0.0001);
		pQueue.nextPatient();
		pQueue.treatNextPatient();
		Assert.assertEquals("numPatients() failure", 0, pQueue.numPatients(), 0.0001);
		
		pQueue.hospitalType();
		pQueue.allPatientInfo();
		
		pQueue.toString();
	}
	
	@Test
	public void personTest() {
		//every method has been tested already in SickTest & HealthyTest, except for getAge():
		Person p1 = new HealthyPerson("p1", 16, "loitering");
		Person p2 = new SickPerson("p2", 45, 8);
		
		Assert.assertEquals("getAge() failure", 16, p1.getAge(), 0.0001);
		Assert.assertEquals("getAge() failure", 45, p2.getAge(), 0.0001);
	}
	
	@Test
	public void animalTest() {
		Animal fido = new Animal("dog", 2);
		Animal mittens = new Animal("cat", 4);
		Animal gator = new Animal("Alligator", 7);
		
		fido.getBreed();
		mittens.getBreed();
		gator.getBreed();
		
		Assert.assertEquals("getAge() failure", 2, fido.getAge(), 0.0001);
		Assert.assertEquals("getAge() failure", 4, mittens.getAge(), 0.0001);
		Assert.assertEquals("getAge() failure", 7, gator.getAge(), 0.0001);
		
		fido.toString();
		mittens.toString();
		gator.toString();
		
		Assert.assertEquals("CompareTo failure", 2, fido.compareTo(mittens), 0.0001);
		Assert.assertEquals("CompareTo failure", 5, fido.compareTo(gator), 0.0001);
	}
}
