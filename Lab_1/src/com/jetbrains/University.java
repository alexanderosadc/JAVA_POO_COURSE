package com.jetbrains;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int foundationYear;
    private List<Student> students = new ArrayList<>();

    University(String name, int foundationYear)
    {
        this.name = name;
        this.foundationYear = foundationYear;
    }

    public void AddStudent(Student student)
    {
        students.add(student);
    }

    public float AverageMarkPerUniversity()
    {
        float sum = 0;

        for (Student student:
             students)
        {
            sum += student.GetMark();
        }
        if(students.size() > 0)
        {
            return  sum / students.size();
        }
        return 0;
    }
}
