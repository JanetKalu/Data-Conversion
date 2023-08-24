package com.happyday.objectconversiondemo.conversion.unmarshalling.model;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement(name = "address")
public class Address {

    @XmlElement(name = "city")
    private String city;
    @XmlElement(name = "house-no")
    private String houseNo;
    @XmlElement(name = "postal-code")
    private String postalCode;
    @XmlElement(name = "state")
    private String state;
}
