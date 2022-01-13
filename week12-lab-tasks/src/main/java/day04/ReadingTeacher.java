package day04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadingTeacher {

    private List<Teacher> teachers = new ArrayList<>();

    public int getHoursByName(String name) {
        teachers = createTeacher();
        int count = 0;
        for (Teacher t : teachers) {
            if (t.getName().equals(name)) {
                count += t.getHoursPerWeek();
            }
        }
        return count;
    }

    public List<Teacher> createTeacher() {
        List<String> stringList = read();
        for (int i = 0; i < stringList.size(); i = i + 4) {
            teachers.add(new Teacher(stringList.get(i), stringList.get(i + 1), stringList.get(i + 2), Integer.parseInt(stringList.get(i + 3))));
        }
        return teachers;
    }

    private List<String> read() {
        List<String> teacherStrings = new ArrayList<>();
        String line;
        String path = "src/main/resources/beosztas.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while ((line = reader.readLine()) != null) {
                teacherStrings.add(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Error by parsing, general io", ioe);
        }
        return teacherStrings;
    }

    public static void main(String[] args) {
        ReadingTeacher readingTeacher = new ReadingTeacher();
        System.out.println(readingTeacher.createTeacher());
    }


}

