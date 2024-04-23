package com.testReactor.demo.Models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Offer {
    private String offerId;
    private String projectId;
    private String priceByContributors;
    private List<Insured> insured;
}
