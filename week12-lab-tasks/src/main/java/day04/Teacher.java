package day04;

public class Teacher {

    private String name;
    private String subject;
    private String classes;
    private int hoursPerWeek;

    public Teacher(String name, String subject, String classes, int hoursPerWeek) {
        this.name = name;
        this.subject = subject;
        this.classes = classes;
        this.hoursPerWeek = hoursPerWeek;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getClasses() {
        return classes;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }
}
