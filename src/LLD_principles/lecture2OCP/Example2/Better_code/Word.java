package LLD_principles.lecture2OCP.Example2.Better_code;

public class Word implements Report{
    @Override
    public String generateReport() {
        return "generating word report";
    }
}
