package com.happyday.objectconversiondemo.conversion.unmarshalling.model.mapper;

import com.happyday.objectconversiondemo.conversion.unmarshalling.model.Address;
import com.happyday.objectconversiondemo.conversion.unmarshalling.model.Department;
import com.happyday.objectconversiondemo.conversion.unmarshalling.model.Employee;
import com.happyday.objectconversiondemo.conversion.unmarshalling.model.PhoneNumber;

public class EmployeeHelper {
    public static Class[] xmlEmployeeObjects = new Class<?>[]
            {
                    Employee.class, Department.class, Address.class, PhoneNumber.class
            };
}
