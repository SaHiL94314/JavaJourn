package LLD_principles.lecture2OCP.Example2.problematic_code;

public class ReportGenerator {
    public String generateReport(String reportType){
        if(reportType.equals("pdf")){
            return "generating pdf report";
        }
        else if(reportType.equals("word")){
            return "generating word report";
        }

        return "report type not supported";

    }
}
