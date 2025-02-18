import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    private String title;

    public JobRole(String title) {
        this.title = title;
    }

    public String getJobTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {
    private String name;
    private T role;

    public Resume(String name, T role) {
        this.name = name;
        this.role = role;
    }

    public String getCandidateName() {
        return name;
    }

    public T getJobRole() {
        return role;
    }

    @Override
    public String toString() {
        return name + " | " + role.getJobTitle();
    }
}

class ResumeScreeningSystem {

    public static void processResumes(List<Resume<? extends JobRole>> resumeAll) {
        for (Resume<? extends JobRole> resume : resumeAll) {
            System.out.println("Processing resume for: " + resume);
        }
    }

    public static void displayJobRoles(List<? extends JobRole> jobRoles) {
        for (JobRole role : jobRoles) {
            System.out.println("Available job role: " + role);
        }
    }
}

public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        DataScientist dataScientist = new DataScientist();
        ProductManager productManager = new ProductManager();

        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("Arsh SIngh", softwareEngineer);
        Resume<DataScientist> dataScientistResume = new Resume<>("raj", dataScientist);
        Resume<ProductManager> productManagerResume = new Resume<>("aman", productManager);

        List<Resume<? extends JobRole>> resumeAll = new ArrayList<>();
        resumeAll.add(softwareEngineerResume);
        resumeAll.add(dataScientistResume);
        resumeAll.add(productManagerResume);

        ResumeScreeningSystem.processResumes(resumeAll);

        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(softwareEngineer);
        jobRoles.add(dataScientist);
        jobRoles.add(productManager);
        ResumeScreeningSystem.displayJobRoles(jobRoles);
    }
}
