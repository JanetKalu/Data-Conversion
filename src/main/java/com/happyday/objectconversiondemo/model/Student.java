package com.happyday.objectconversiondemo.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer studId;
    private String studName;
    private String studSkill;

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", studName='" + studName + '\'' +
                ", studSkill='" + studSkill + '\'' +
                '}';
    }
}
