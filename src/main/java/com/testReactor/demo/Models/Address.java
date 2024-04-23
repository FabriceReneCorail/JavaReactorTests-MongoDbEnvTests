package com.testReactor.demo.Models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String streetName;
    private Integer number;
    private Insured stage;
}
