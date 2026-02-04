import java.util.Date;

public class Report {
    private int Report_code;
    private Date Report_date;

    public Report(int Report_code, Date Report_date) {
        this.Report_code = Report_code;
        this.Report_date = Report_date;
    }

    public void viewReports() {
        System.out.println("viewReports");
    }

    public void creatReports() {
        System.out.println("creatReports");
    }

}