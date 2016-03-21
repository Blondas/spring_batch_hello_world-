package solutions.mrwoolf;


import org.springframework.batch.item.ItemProcessor;
import solutions.mrwoolf.model.Report;

// reader => processor => writer
public class CustomItemProcessor implements ItemProcessor<Report, Report> {
    @Override
    public Report process(Report report) throws Exception {
        System.out.println("Processing..." + report);
        return report;
    }
}
