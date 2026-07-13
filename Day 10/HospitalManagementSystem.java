import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Hospital Management System (OOP Demo) ===");
        Hospital hospital = new Hospital("St. Jude Medical Center");

        Doctor doc = new Doctor("DOC-101", "Dr. Gregory House", "Diagnostic Medicine", 250.0);
        Patient pat = new Patient("PAT-501", "John Doe", 42, "Lupus Checkup");

        hospital.addDoctor(doc);
        hospital.admitPatient(pat);

        hospital.displayStatus();

        doc.treatPatient(pat);
        pat.discharge();
        hospital.displayStatus();
    }
}

class PersonHospital {
    protected String name;
    protected int age;

    public PersonHospital(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Doctor extends PersonHospital {
    private String doctorId;
    private String specialty;
    private double consultationFee;

    public Doctor(String doctorId, String name, String specialty, double consultationFee) {
        super(name, 45); // default age
        this.doctorId = doctorId;
        this.specialty = specialty;
        this.consultationFee = consultationFee;
    }

    public void treatPatient(Patient patient) {
        System.out.printf("[Doctor %s] Examining and diagnosing patient %s for illness: %s%n", name, patient.getName(), patient.getIllness());
    }

    public void displayInfo() {
        System.out.printf("Doctor ID: %-8s | Name: %-18s | Specialty: %-20s | Fee: $%.2f%n", doctorId, name, specialty, consultationFee);
    }
}

class Patient extends PersonHospital {
    private String patientId;
    private String illness;
    private boolean isAdmitted;

    public Patient(String patientId, String name, int age, String illness) {
        super(name, age);
        this.patientId = patientId;
        this.illness = illness;
        this.isAdmitted = true;
    }

    public String getName() { return name; }
    public String getIllness() { return illness; }
    public boolean isAdmitted() { return isAdmitted; }

    public void discharge() {
        this.isAdmitted = false;
        System.out.println("[Patient] " + name + " has recovered and is now discharged.");
    }

    public void displayInfo() {
        System.out.printf("Patient ID: %-7s | Name: %-18s | Age: %2d | Illness: %-18s | Admitted: %s%n",
                patientId, name, age, illness, (isAdmitted ? "YES" : "NO"));
    }
}

class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doc) { doctors.add(doc); }
    public void admitPatient(Patient pat) { patients.add(pat); }

    public void displayStatus() {
        System.out.println("\n=== Hospital Status: " + name + " ===");
        System.out.println("--- Registered Doctors ---");
        for (Doctor d : doctors) d.displayInfo();
        System.out.println("--- Current Patients ---");
        for (Patient p : patients) p.displayInfo();
        System.out.println();
    }
}
