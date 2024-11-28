public class Main {
    public static void main(String[] args) {
        // Create a Binary Search Tree for patients
        PatientBST patientBST = new PatientBST();

        // Create some patients
        Patient patient1 = new Patient("23101421", "Alice", 25, "123-456-7890", "No known allergies");
        Patient patient2 = new Patient("23101428", "Bob", 32, "987-654-3210", "Asthma");
        Patient patient3 = new Patient("23101598", "Charlie", 45, "555-555-5555", "Diabetes");
        Patient patient4 = new Patient("23019490", "Diana", 28, "444-444-4444", "Hypertension");


        Appointment a = new Appointment(23101421, patient4, new Date(12, 1), new Date.Time(20, 30), "Scadule");
        patient4.getVisitRecords().add(a);
        // Insert patients into the BST
        patientBST.insert(patient1);
        patientBST.insert(patient2);
        patientBST.insert(patient3);
        patientBST.insert(patient4);

        // Display patients in order
        System.out.println("Patients in BST (In-Order Traversal):");
        patientBST.displayInOrder();

        // Search for a patient by ID
        System.out.println("\nSearching for patient with ID P002:");
        Patient searchResult = patientBST.search("P002");
        if (searchResult != null) {
            searchResult.displayPatientInfo();
        } else {
            System.out.println("Patient not found!");
        }

        // Delete a patient and display the tree again
        System.out.println("\nDeleting patient with ID P003...");
        patientBST.delete("23101421");

        System.out.println("Patients in BST after deletion (In-Order Traversal):");
        patientBST.displayInOrder();

        // Attempt to search for the deleted patient
        System.out.println("\nSearching for patient with ID P003:");
        Patient deletedSearchResult = patientBST.search("23101421");
        if (deletedSearchResult != null) {
            deletedSearchResult.displayPatientInfo();
        } else {
            System.out.println("Patient not found!");
        }
    }
}
