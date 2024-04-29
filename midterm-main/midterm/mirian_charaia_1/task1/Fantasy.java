package midterm.mirian_charaia_1.task1;

import java.util.List;

public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName;

    public Fantasy(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String describeDream() {
        return "This is my dream...";
    }

    @Override
    public void setDreamLocation(String location) {
        // Implement setting dream location
    }

    @Override
    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Fantasy by " + studentName;
    }

    @Override
    public String getLinear1() {
        return null;
    }

    @Override
    public String getCake2() {
        return null;
    }

    @Override
    public String methodSocial3(String argEntanglement5) {
        return null;
    }

    @Override
    public List<String> methodKnife4(String argDance6) {
        return null;
    }
}

