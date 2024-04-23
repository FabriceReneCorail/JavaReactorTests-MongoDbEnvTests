package com.testReactor.demo.Models;

import com.nimbusds.openid.connect.sdk.assurance.claims.CountryCode;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InsuredLocation {
    private Address address;
    private String addressInformation;
    private String ZipCode;
    private CountryCode countryCode;
}
