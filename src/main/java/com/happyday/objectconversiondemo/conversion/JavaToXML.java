package com.happyday.objectconversiondemo.conversion;

import com.happyday.objectconversiondemo.model.Person;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.StringWriter;

public class JavaToXML {
    public static void main(String[] args) throws JAXBException {

        //Java Object to XML and Back
        System.out.println("========== Hello JAXB!!! ===============");
        Person person = new Person();
        person.setFullName("Peter Obi");
        person.setAge(55);
        person.setCountry("Nigeria");

        // Create a Marshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        StringWriter writer = new StringWriter();
        marshaller.marshal(person, writer);
        System.out.println(writer.toString());

    }

}
