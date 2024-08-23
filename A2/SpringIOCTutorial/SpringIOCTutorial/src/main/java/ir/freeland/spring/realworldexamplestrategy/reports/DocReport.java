package ir.freeland.spring.realworldexamplestrategy.reports;

import org.springframework.stereotype.Component;

@Component("DOC")
public class DocReport implements Report {
    @Override
    public byte[] generate(ReportDto report) {
        return new byte[0];
    }
}