package com.testReactor.demo.Service.ServiceImpl;

import com.testReactor.demo.Models.Insured;
import com.testReactor.demo.Models.Project;
import reactor.core.publisher.Flux;

public interface InsuredService {
    Flux<Insured> getAllInsured(Project project);
}
