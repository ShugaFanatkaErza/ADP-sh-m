package module_05.home_work.Builder;

public class ReportDirector {

    public void constructReport(IReportBuilder builder) {
        builder.setHeader("Shuga Report");
        builder.setContent("20%");
        builder.setFooter("Confidential");
    }
}