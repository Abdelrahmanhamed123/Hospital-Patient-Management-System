# Hospital Patient Management System

Developed as part of the CSE 111 Data Structures course at Alamein University.  
This system organizes patient records, manages appointments, tracks billing, and generates detailed reports. Built using advanced data structures like Binary Search Trees and Queues, it ensures smooth and efficient hospital operations.

## ⚙️ Core Features

### 1. Patient Management 🏥
- **Attributes**: patientID, name, age, contactInfo, medicalHistory, visitRecords  
- **Key Functions**:
  - Update contact info 📞  
  - Add new medical visits 📝  
  - Quick retrieval using Binary Search Trees (BST) 🔍  

### 2. Appointment Management 📅
- **Attributes**: appointmentID, patient, date, time, status  
- **Key Functions**:
  - Schedule, cancel, and reschedule appointments 📆  
  - Efficient appointment management with Queues for priority handling ⏳  

### 3. Waiting List Management ⏳
- **Attributes**: Queue for storing waiting patients  
- **Key Functions**:
  - Add patients to the waiting list 🛑  
  - Automatic priority management (Bonus: Priority Queue) 🎯  

### 4. Billing System 💸
- **Attributes**: patientID, billingAmount, paymentHistory  
- **Key Functions**:
  - Generate bills 🧾  
  - Record payments 💳  
  - Check outstanding balances 🔔  

### 5. Report Generation 📊
- **Attributes**: Patient visit summaries, appointment stats, revenue reports  
- **Key Functions**:
  - Use Merge Sort or Quick Sort to organize data 📈  
  - Export detailed reports for hospital management 📥  

### 6. System Integration 🔗
- Combines all functionalities into a seamless system for managing patients, appointments, waiting lists, billing, and reports.

## 🛠 Technologies Used
- **Programming Language**: Java ☕  
- **Data Structures**:
  - Binary Search Trees (BST) for fast search 🔍  
  - Queues for managing appointment priority ⏳  
  - Priority Queues for the waiting list 🎯  
- **Sorting Algorithms**: Merge Sort, Quick Sort 🔄  
- **Optional GUI**: JavaFX or Swing 🖥️
