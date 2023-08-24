package com.happyday.objectconversiondemo.conversion.unmarshalling.model;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlAccessorType(value = XmlAccessType.FIELD)
@XmlRootElement(name = "employee")
public class Employee {
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "phone-number")
    private PhoneNumber phoneNumber;
    @XmlElement(name = "address")
    private Address address;
    @XmlElement(name = "department")
    private Department department;




        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("Employee{" +
                    "name='" + name + '\'' +
                    ", phoneNumber=" + phoneNumber);

            if (address != null) {
                sb.append(", address=").append(address);
            }

            if (department != null) {
                sb.append(", department=").append(department);
            }

            return sb.append('}').toString();
        }




//    @Override
//    public String toString() {
//
//       if(address == null) {
//           return "Employee{" +
//                   "name='" + name + '\'' +
//                   ", phoneNumber=" + phoneNumber +
//                   ", department=" + department +
//                   '}';
//       } else if (this.department == null) {
//           return "Employee{" +
//                   "name='" + name + '\'' +
//                   ", phoneNumber=" + phoneNumber +
//                   ", address=" + address +
//                   '}';
//       }else {
//
//            return "Employee{" +
//                    "name='" + name + '\'' +
//                    ", phoneNumber=" + phoneNumber +
//                    ", address=" + address +
//                    ", department=" + department +
//                    '}';
//        }
//}
}
