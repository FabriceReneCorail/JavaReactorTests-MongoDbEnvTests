package com.testReactor.demo.Service.ServiceImpl;

import com.testReactor.demo.Models.Insured;
import com.testReactor.demo.Models.InsuredStatus;
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
    public Flux<Insured> getMainInsured(Project project) {
        return Flux.fromIterable(project.getOffers())
                .flatMap(offer -> Flux.fromIterable(offer.getInsured()))
                .filter(insured -> insured.getStatus() == InsuredStatus.MAIN_INSURED);
    }

    @Override
    public Flux<Insured> getAllInsureds(Project project) {
        return null;
    }
}
