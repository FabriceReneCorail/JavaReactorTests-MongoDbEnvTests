package com.testReactor.demo.Service.ServiceImpl;

import com.testReactor.demo.Models.Insured;
import com.testReactor.demo.Models.Project;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InsuredService {
    Flux<Insured> getAllInsuredFromProject(Project project);
    Flux<Insured> getMainInsuredFromProject(Project project);
}
