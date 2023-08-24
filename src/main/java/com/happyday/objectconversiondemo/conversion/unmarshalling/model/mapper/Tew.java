package com.happyday.objectconversiondemo.conversion.unmarshalling.model.mapper;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.io.StringWriter;

@XmlRootElement
@XmlAccessorType(value = XmlAccessType.FIELD)
@Data
public class Tew {
    @XmlElement
    private String job;
    @XmlAttribute
    private String title;

    public static void main(String[] args) throws JAXBException {
        Tew tew = new Tew();
        tew.setJob("Engineering");
        tew.setTitle("Software");

        // Create a Marshaller
        JAXBContext jaxbContext = JAXBContext.newInstance(Tew.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        StringWriter writer = new StringWriter();
        marshaller.marshal(tew, writer);
        System.out.println(writer);


    }
}
