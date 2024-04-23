package com.testReactor.demo.Models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Project {
    private String projectId;
    private List<Offer> offers;
}
