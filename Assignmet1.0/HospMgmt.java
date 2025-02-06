import java.util.ArrayList;
import java.util.List;

class Pat {
    private String patName;
    private List<Doc> docs;

    public Pat(String patName) {
        this.patName = patName;
        this.docs = new ArrayList<>();
    }

    public String getPatName() {
        return patName;
    }

    public void addDoc(Doc doc) {
        if (!docs.contains(doc)) {
            docs.add(doc);
            doc.addPat(this);
        }
    }

    public void showDocs() {
        System.out.println(patName + " is consulting with");
        for (Doc doc : docs) {
            System.out.println("  - Dr. " + doc.getDocName());
        }
    }
}

class Doc {
    private String docName;
    private List<Pat> pats;

    public Doc(String docName) {
        this.docName = docName;
        this.pats = new ArrayList<>();
    }

    public String getDocName() {
        return docName;
    }

    public void addPat(Pat pat) {
        if (!pats.contains(pat)) {
            pats.add(pat);
            pat.addDoc(this);
        }
    }

    public void consult(Pat pat) {
        System.out.println("Dr. " + docName + " is consulting " + pat.getPatName());
    }

    public void showPats() {
        System.out.println("Dr. " + docName + " is treating");
        for (Pat pat : pats) {
            System.out.println("  - " + pat.getPatName());
        }
    }
}

class Hosp {
    private String hospName;
    private List<Doc> docs;
    private List<Pat> pats;

    public Hosp(String hospName) {
        this.hospName = hospName;
        this.docs = new ArrayList<>();
        this.pats = new ArrayList<>();
    }

    public void addDoc(Doc doc) {
        docs.add(doc);
    }

    public void addPat(Pat pat) {
        pats.add(pat);
    }

    public void showDocs() {
        System.out.println("Doctors at " + hospName + " are");
        for (Doc doc : docs) {
            System.out.println("  - Dr. " + doc.getDocName());
        }
    }

    public void showPats() {
        System.out.println("Patients at " + hospName + " are");
        for (Pat pat : pats) {
            System.out.println("  - " + pat.getPatName());
        }
    }
}

public class HospMgmt {
    public static void main(String[] args) {
        Hosp hosp = new Hosp("Apollo Hospital");

        Doc doc1 = new Doc("Sharma");
        Doc doc2 = new Doc("Verma");

        Pat pat1 = new Pat("Amit");
        Pat pat2 = new Pat("Ravi");
        hosp.addDoc(doc1);
        hosp.addDoc(doc2);
        hosp.addPat(pat1);
        hosp.addPat(pat2);

        // Relationships
        doc1.addPat(pat1);
        doc1.addPat(pat2);
        doc2.addPat(pat1);

        // Displaying
        System.out.println();
        doc1.showPats();
        System.out.println();
        doc2.showPats();
        System.out.println();

        pat1.showDocs();
        System.out.println();
        pat2.showDocs();
        System.out.println();

        System.out.println();
        doc1.consult(pat1);
        doc2.consult(pat1);
        doc1.consult(pat2);
    }
}
