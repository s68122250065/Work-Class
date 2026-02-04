public class Applicant {

    private int Applicant_id;
    private String Applicant_name;
    private String Applicant_job;
    private String Applicant_address;
    private Gender Applicant_gender;
    private char Applicant_tel;

    public Applicant(int Applicant_id, String Applicant_name,
            String Applicant_job, String Applicant_address, Gender Applicant_gender, char Applicant_tel) {
        this.Applicant_id = Applicant_id;
        this.Applicant_name = Applicant_name;
        this.Applicant_job = Applicant_job;
        this.Applicant_address = Applicant_address;
        this.Applicant_gender = Applicant_gender;
        this.Applicant_tel = Applicant_tel;
    }

    public void insertApplicant() {
        System.out.println("insertApplicant");
    }

    public void updateApplicant() {
        System.out.println("updateApplicant");
    }

    public void deleteApplicant() {
        System.out.println("deleteApplicant");
    }
}
