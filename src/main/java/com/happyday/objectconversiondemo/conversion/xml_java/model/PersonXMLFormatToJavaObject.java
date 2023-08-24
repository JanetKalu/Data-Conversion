package com.happyday.objectconversiondemo.conversion.xml_java.model;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class PersonXMLFormatToJavaObject {
    public static void main(String[] args) throws JAXBException {
        //Unmarshaller

        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        File file = new File("person.xml");
        Person per = (Person) unmarshaller.unmarshal(file);

        System.out.println(per.toString());
    }

}
