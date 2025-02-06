import java.util.ArrayList;
import java.util.List;

class Crs {
    private String crsName;
    private List<Std> enrolledStds;

    public Crs(String crsName) {
        this.crsName = crsName;
        this.enrolledStds = new ArrayList<>();
    }

    public void enrollStd(Std std) {
        if (!enrolledStds.contains(std)) {
            enrolledStds.add(std);
            std.addCrs(this);
        }
    }

    public void showEnrolledStds() {
        System.out.println("Course: " + crsName);
        if (enrolledStds.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Std std : enrolledStds) {
                System.out.println("  Student: " + std.getStdName());
            }
        }
    }

    public String getCrsName() {
        return crsName;
    }
}

class Std {
    private String stdName;
    private List<Crs> crsList;

    public Std(String stdName) {
        this.stdName = stdName;
        this.crsList = new ArrayList<>();
    }

    public void addCrs(Crs crs) {
        if (!crsList.contains(crs)) {
            crsList.add(crs);
        }
    }

    public void enrollInCrs(Crs crs) {
        crs.enrollStd(this);
    }

    public void showEnrolledCrs() {
        System.out.println("Student: " + stdName);
        if (crsList.isEmpty()) {
            System.out.println("  Not enrolled in any courses.");
        } else {
            for (Crs crs : crsList) {
                System.out.println("  Course: " + crs.getCrsName());
            }
        }
    }

    public String getStdName() {
        return stdName;
    }
}

class Sch {
    private String schName;
    private List<Std> stdList;

    public Sch(String schName) {
        this.schName = schName;
        this.stdList = new ArrayList<>();
    }

    public void addStd(Std std) {
        if (!stdList.contains(std)) {
            stdList.add(std);
        }
    }

    public void showStds() {
        System.out.println("School: " + schName);
        if (stdList.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Std std : stdList) {
                System.out.println("  Student: " + std.getStdName());
            }
        }
    }
}

public class SchMgmtSys {
    public static void main(String[] args) {
        // Creating School
        Sch sch = new Sch("Vivekananda Vidyalaya");

        // Creating Students with Indian Names
        Std raju = new Std("Raju");
        Std ravi = new Std("Ravi");

        // Creating Courses
        Crs maths = new Crs("Mathematics");
        Crs science = new Crs("Science");

        // Enrolling Students in Courses
        raju.enrollInCrs(maths);
        raju.enrollInCrs(science);
        ravi.enrollInCrs(maths);

        // Adding Students to School
        sch.addStd(raju);
        sch.addStd(ravi);

        // Displaying Students in School
        sch.showStds();

        // Displaying Student Enrollments
        System.out.println();
        raju.showEnrolledCrs();
        ravi.showEnrolledCrs();

        // Displaying Course Enrollments
        System.out.println();
        maths.showEnrolledStds();
        science.showEnrolledStds();
    }
}
