import java.util.Date;

public class Proposal {

    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal proposal_status;
    private Applicant applicant;

    public Proposal(String proposal_code, String proposal_title,
            String proposal_text, Date proposal_date,
            Applicant applicant) {

        this.proposal_code = proposal_code;
        this.proposal_title = proposal_title;
        this.proposal_text = proposal_text;
        this.proposal_date = proposal_date;
        this.applicant = applicant;
        this.proposal_status = StatusProposal.Waiting;
    }

    public void viewProposal() {
        System.out.println("viewProposal");
    }

    public void viewStatus() {
        System.out.println("Status: " + proposal_status);
    }

    public void updateProposal() {
        System.out.println("updateProposal");
    }

    public void deleteProposal() {
        System.out.println("deleteProposal");
    }

    public void archiveProposal() {
        System.out.println("archiveProposal");
    }

    public void viewApplicant() {
        System.out.println("viewApplicant: " + applicant);
    }
}
