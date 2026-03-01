package module_05.practise_work.Builder;

public class ReportDirector {
    public void construct(IReportBuilder builder, ReportStyle style) {
        builder.setStyle(style);
        builder.setHeader("Shugylas Report");

        builder.addSection("Doramas", "Doramas data...");

        builder.addSection("Views", "views data...");
        
        builder.setFooter("Confidential");
    }
}
