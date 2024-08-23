package ir.freeland.spring.realworldexamplestrategy.reports;

public interface Report {
    byte[] generate(ReportDto report);
}