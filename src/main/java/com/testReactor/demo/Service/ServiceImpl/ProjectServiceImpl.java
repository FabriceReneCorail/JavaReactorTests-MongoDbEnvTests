package com.testReactor.demo.Service.ServiceImpl;

import com.testReactor.demo.Models.Insured;
import com.testReactor.demo.Models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private InsuredService insuredService;
    @Override
    public Mono<Insured> getMainInsured(Project project) {
        return Flux.just(project).map(insured -> insuredService.getMainInsured());
    }

    @Override
    public Flux<Insured> getAllInsureds(Project project) {
        return null;
    }
}
