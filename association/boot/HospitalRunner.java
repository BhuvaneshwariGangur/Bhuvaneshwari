package association.boot;

import association.app.Hospital;
import association.app.Doctor;
import association.app.Nurse;
import association.app.Patient;


public class HospitalRunner {

				public static void main(String[] args) {
					
					System.out.println("Invoking main in HospitalDoctor");
					
					Hospital hospital=new Hospital(); 
					hospital.treatment();
					hospital.rooms();
					
					Doctor doctor=new Doctor();
					doctor.stethoscope();
					doctor.whiteCoat();
					
					Nurse nurse=new Nurse();
					nurse.injection();
					nurse.tools();
					
					Patient patient=new Patient();
					patient.fever();
					patient.cough();
					
				}
			

		}


	