package com.happyday.objectconversiondemo.conversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.happyday.objectconversiondemo.model.Student;
import jakarta.xml.bind.JAXBException;

import java.util.ArrayList;
import java.util.List;

public class JavaToJSON {
    public static void main(String[] args) throws JAXBException, JsonProcessingException {
        //Java To JSON And Back

        System.out.println("======================= Hello JSON!!! =======================");
        Student student1 = new Student();
        student1.setStudId(1);
        student1.setStudName("Ada Chike");
        student1.setStudSkill("Fashion Designer");

        Student student2 = new Student();
        student2.setStudId(2);
        student2.setStudName("Genevieve Nnaji");
        student2.setStudSkill("Actor");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        ObjectMapper mapper = new ObjectMapper();
        String studJsn = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(studentList);
        System.out.println(studJsn);

    }

}

