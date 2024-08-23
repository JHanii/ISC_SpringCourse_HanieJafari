package ir.freeland.spring.realworldexamplestrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ir.freeland.spring.realworldexamplestrategy.reports.Report;
import ir.freeland.spring.realworldexamplestrategy.reports.ReportDto;

@Service
public class ReportConversionService {

    private final Map<String, Report> strategies = new HashMap<>();

    @Autowired
    public ReportConversionService(List<Report> strategies) {
        strategies.forEach(strategy ->
                this.strategies.put(strategy.getClass().getAnnotation(Component.class).value(), strategy));
    }

    public byte[] convertReport(String format, ReportDto report) {
        Report strategy = strategies.get(format.toUpperCase());
        if (strategy == null) {
            throw new UnsupportedOperationException("Unsupported format: " + format);
        }
        System.out.println("The format type is: " + format );
        return strategy.generate(report);
    }
}