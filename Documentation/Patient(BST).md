# Patient and PatientBST Classes Documentation

## Patient Class Methods

### 1. `getPatientID()`
**Purpose**: Returns the unique identifier (`patientID`) of the patient.  
**Explanation**: This method is a simple getter that allows external access to the `patientID` field of the `Patient` class.

---

### 2. `getContactInfo()`
**Purpose**: Returns the contact information of the patient.  
**Explanation**: This is another getter method that returns the `contactInfo` field, which stores the patient's contact details (e.g., phone number or email).

---

### 3. `getAge()`
**Purpose**: Returns the age of the patient.  
**Explanation**: This method is a getter for the `age` field. It returns the patient's age as an integer.

---

### 4. `getMedicalHistory()`
**Purpose**: Returns the medical history of the patient.  
**Explanation**: This method returns the `medicalHistory` field, which contains information about the patient's past illnesses, treatments, surgeries, etc.

---

### 5. `getName()`
**Purpose**: Returns the name of the patient.  
**Explanation**: This method simply returns the `name` field of the patient, which stores the patient's full name.

---

### 6. `getVisitRecords()`
**Purpose**: Returns the list of visit records (appointments) associated with the patient.  
**Explanation**: This method returns the `visitRecords` list, which contains all the `Appointment` objects associated with the patient. The list may be empty if no visits have been recorded yet.

---

### 7. `updateContactInfo(String newContactInfo)`
**Purpose**: Updates the contact information for the patient.  
**Explanation**: This method takes a string argument (`newContactInfo`) and updates the `contactInfo` field with the new contact details. It also prints a message ("contact updated") to indicate that the patient's contact information has been successfully updated.

---

### 8. `addvisits(Appointment visit)`
**Purpose**: Adds a new appointment to the patient's visit records.  
**Explanation**: This method takes an `Appointment` object (`visit`) and adds it to the `visitRecords` list. It also prints a message indicating that the visit has been added, including the appointment ID and patient name.

---

### 9. `displayPatientInfo()`
**Purpose**: Displays detailed information about the patient.  
**Explanation**: This method prints out the patient's details such as `patientID`, `name`, `age`, `contactInfo`, and `medicalHistory`. It also checks if there are any visit records. If there are, it iterates over the `visitRecords` list and prints the details of each visit (appointment ID, date, time, and status).

---

## PatientBST Class Methods

### 1. `insert(Patient patient)`
**Purpose**: Inserts a new patient into the binary search tree (BST).  
**Explanation**: This method starts the process of inserting a new `Patient` object into the BST. It calls the private helper method `insertRecursive` to perform the actual insertion. It ensures that patients are inserted in the correct position based on their `patientID` in ascending order.

---

### 2. `insertRecursive(Node root, Patient patient)`
**Purpose**: Recursively inserts a patient into the BST.  
**Explanation**: This method compares the `patientID` of the current node with the `patientID` of the new patient and determines where to insert the new patient in the BST. It ensures that the tree maintains its ordered structure.

---

### 3. `search(String patientID)`
**Purpose**: Searches for a patient by their `patientID` in the BST.  
**Explanation**: This method initiates the search by calling the private helper method `searchRecursive`. It looks for a matching patient in the BST and returns the `Patient` object if found, or `null` if not found.

---

### 4. `searchRecursive(Node current, String patientID)`
**Purpose**: Recursively searches for a patient by `patientID` in the BST.  
**Explanation**: This method searches through the BST recursively and returns the `Patient` object if a match is found, or `null` if no match is found.

---

### 5. `delete(String patientID)`
**Purpose**: Deletes a patient from the BST by their `patientID`.  
**Explanation**: This method deletes a patient from the BST by calling the helper method `deleteRecursive`. It handles various deletion cases, including deleting nodes with no children, one child, or two children.

---

### 6. `deleteRecursive(Node current, String patientID)`
**Purpose**: Recursively deletes a patient from the BST.  
**Explanation**: This helper method finds the node to delete and handles the deletion process. It ensures that the tree structure remains intact after the node is deleted.

---

### 7. `findSmallest(Node root)`
**Purpose**: Finds the smallest patient node in the BST.  
**Explanation**: This method is used during the deletion of a node with two children. It finds the smallest node in the right subtree of the current node to replace the node being deleted.

---

### 8. `displayInOrder()`
**Purpose**: Displays the patients in the BST in ascending order of their `patientID`.  
**Explanation**: This method starts the in-order traversal of the BST by calling `displayInOrderRecursive`, which prints the details of all patients in ascending order.

---

### 9. `displayInOrderRecursive(Node current)`
**Purpose**: Recursively displays the patients in the BST in ascending order.  
**Explanation**: This recursive helper method performs the in-order traversal of the BST and prints the details of each patient using the `displayPatientInfo()` method.
