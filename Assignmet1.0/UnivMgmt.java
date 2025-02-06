import java.util.ArrayList;
import java.util.List;

class Fac {
    private String facName;

    public Fac(String facName) {
        this.facName = facName;
    }

    public String getFacName() {
        return facName;
    }
}

class Dept {
    private String deptName;

    public Dept(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

class Univ {
    private String univName;
    private List<Dept> depts;
    private List<Fac> facs;

    public Univ(String univName) {
        this.univName = univName;
        this.depts = new ArrayList<>();
        this.facs = new ArrayList<>();
    }

    public void addDept(String deptName) {
        depts.add(new Dept(deptName));
    }

    public void addFac(Fac fac) {
        facs.add(fac);
    }

    public void showDepts() {
        System.out.println("University " + univName + " has");
        if (depts.isEmpty()) {
            System.out.println("  No departments available");
        } else {
            for (Dept dept : depts) {
                System.out.println("  Department " + dept.getDeptName());
            }
        }
    }

    public void showFacs() {
        System.out.println("Faculty Members of " + univName + " are");
        if (facs.isEmpty()) {
            System.out.println("  No faculty members");
        } else {
            for (Fac fac : facs) {
                System.out.println("  Faculty " + fac.getFacName());
            }
        }
    }

    public void deleteUniv() {
        System.out.println("Deleting University " + univName);
        depts.clear();
        facs.clear();
    }
}

public class UnivMgmt {
    public static void main(String[] args) {

        Univ univ = new Univ("IIT Bombay");

        univ.addDept("Computer Science");
        univ.addDept("Mechanical Engineering");

        Fac profRaju = new Fac("Dr. Raju");
        Fac profSundar = new Fac("Dr. Sundar");

        univ.addFac(profRaju);
        univ.addFac(profSundar);

        univ.showDepts();
        System.out.println();

        univ.showFacs();
        System.out.println();

        System.out.println("Deleting University...");
        univ.deleteUniv();

        System.out.println();
        univ.showDepts();

        System.out.println();
        profRaju = new Fac("Dr. Raju");
        System.out.println("Independent Faculty " + profRaju.getFacName());
    }
}
