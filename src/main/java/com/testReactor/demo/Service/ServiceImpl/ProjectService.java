package com.testReactor.demo.Service.ServiceImpl;

import com.testReactor.demo.Models.Insured;
import com.testReactor.demo.Models.Project;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@Component
public interface ProjectService {

    Flux<Insured> getMainInsured(Project project);

    Flux<Insured> getAllInsureds(Project project);

}
