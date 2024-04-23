package com.testReactor.demo.Models;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Insured {
    private String id;
    private String firstName;
    private String lastName;
    private InsuredInformation insuredInformations;
}
