package com.testReactor.demo.Models;

import com.testReactor.demo.Enum.MaritalStatus;
import com.testReactor.demo.Enum.Gender;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class InsuredInformation {
    private MaritalStatus maritalStatus;
    private Integer age;
    private Gender gender;
    private String mail;
    private String phoneNumber;
    private InsuredLocation insuredLocation;
}
