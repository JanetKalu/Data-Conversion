package com.happyday.objectconversiondemo.conversion.unmarshalling;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.happyday.objectconversiondemo.conversion.unmarshalling.model.Employee;
import com.happyday.objectconversiondemo.conversion.unmarshalling.model.mapper.EmployeeHelper;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.json.JSONObject;

import java.io.File;

public class EmployeeUnmarshalling {
    public static void main(String[] args) throws JAXBException, JsonProcessingException {

        //Unmarshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeHelper.xmlEmployeeObjects);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        File file = new File("employee.xml");
        Employee per = (Employee) unmarshaller.unmarshal(file);
        System.out.println("XML TO Java=============");
        System.out.println(per.toString());

        //Conversion To JSON Object
        System.out.println("Java Object to JSON using JSONObject=============");
        System.out.println();
        JSONObject jsonObject = new JSONObject(per);
        System.out.println(jsonObject);

       //Conversion To JSON Object
        System.out.println("Java TO JSON USing ObjectMapper=============");
        System.out.println();
        ObjectMapper mapper = new ObjectMapper();
        String studJsn = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(per);
        System.out.println(studJsn);


    }

}
