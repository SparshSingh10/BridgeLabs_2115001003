class Patient {
    private static String hospitalName = "Rainbow hospital";
    private final int patientID;
    private static int total = 0;

    private String name;
    private String Ailment;
    private int age;

    public Patient(String name, int age, String Ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.Ailment = Ailment;
        this.patientID = patientID;
        total++;
    }

    public static void gettotal() {
        System.out.println("total patients " + total);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("hospital name " + hospitalName);
            System.out.println("patient name " + name);
            System.out.println("age " + age);
            System.out.println("Ailment " + Ailment);
            System.out.println("patient id " + patientID);
        } else {
            System.out.println("invalid patient object");
        }
    }

    public static void main(String[] args) {
        Patient patient1 = new Patient("johnny dept", 15, "illness", 11);
        Patient patient2 = new Patient("raj", 28, "Flu", 12);

        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        gettotal();
    }
}
