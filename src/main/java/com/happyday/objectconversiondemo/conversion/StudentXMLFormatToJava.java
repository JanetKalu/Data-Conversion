package com.happyday.objectconversiondemo.conversion;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.happyday.objectconversiondemo.conversion.xml_java.model.Student;

import java.io.File;

public class StudentXMLFormatToJava {
    public static void main(String[] args) throws Exception {
       // convertJsonToJava();
        convertJsonToJavaObjects();
    }
    public static void convertJsonToJava() throws Exception {
        File file = new File("student.json");
        ObjectMapper mapper = new ObjectMapper();
        Student student = mapper.readValue(file, Student.class);
        System.out.println(student);
    }

    public static void convertJsonToJavaObjects() throws Exception {
        File file = new File("studentList.json");
        ObjectMapper mapper = new ObjectMapper();
        Student[] student = mapper.readValue(file, Student[].class);
        for(Student stud: student)
          System.out.println(stud);
    }
}
