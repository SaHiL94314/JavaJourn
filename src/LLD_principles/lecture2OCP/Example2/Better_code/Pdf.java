package LLD_principles.lecture2OCP.Example2.Better_code;

public class Pdf implements Report{

    @Override
    public String generateReport() {
        return "generating pdf report";
    }
}
