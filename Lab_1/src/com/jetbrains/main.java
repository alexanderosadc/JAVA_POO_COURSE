package com.jetbrains;

import java.io.DataInputStream;
import java.util.Scanner;

public class main {

    public static void main(String[] args)
    {
        //Monitors();
        Universities();
    }

    private static void Universities()
    {
        DataInputStream dataInputStream = new DataInputStream(System.in);
        Scanner scanner = new Scanner(System.in);

        University university_1 = new University("Harvard", 1636);
        University university_2 = new University("Oxford", 1096);
        University university_3 = new University("Cambridge", 1534);

        Student student_1 = new Student("Adolf", 100, 5.5f);
        Student student_2 = new Student("Vitioc", 27, 8.8f);
        Student student_3 = new Student("Adam", 18, 7.6f);

        university_1.AddStudent(student_1);
        university_1.AddStudent(student_2);
        university_3.AddStudent(student_3);

        System.out.println(university_1.AverageMarkPerUniversity());
        System.out.println(university_2.AverageMarkPerUniversity());
        System.out.println(university_3.AverageMarkPerUniversity());
     }


    private static void Monitors()
    {
        Monitor Acer = new Monitor("CB241H", 1920, 1080,
                60, 1, false, PanelTechnology.IPS);
        Monitor Dell = new Monitor("FV280", 600, 400,
                60, 2, true, PanelTechnology.TN);
        Acer.ShowCharacteristicsOfMonitor();

        if(Acer.xResolution > Dell.xResolution && Acer.yResolution > Dell.yResolution)
        {
            System.out.println("Acer" + Acer.modelName + " is Better than" + Dell.modelName);
        }
        else
        {
            System.out.println("Dell" + Dell.modelName + " is Better than " + Acer.modelName);
        }
    }
}
