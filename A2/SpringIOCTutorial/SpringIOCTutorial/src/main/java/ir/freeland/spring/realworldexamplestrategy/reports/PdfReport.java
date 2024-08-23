package ir.freeland.spring.realworldexamplestrategy.reports;

import org.springframework.stereotype.Component;

@Component("PDF")
public class PdfReport implements Report {
    @Override
    public byte[] generate(ReportDto report) {
        return new byte[0];
    }
}