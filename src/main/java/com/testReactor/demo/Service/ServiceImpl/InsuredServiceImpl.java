package com.testReactor.demo.Service.ServiceImpl;

import com.testReactor.demo.Enum.InsuredStatus;
import com.testReactor.demo.Models.Insured;
import com.testReactor.demo.Models.Project;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class InsuredServiceImpl implements InsuredService{

    @Override
    public Flux<Insured> getAllInsuredFromProject(Project project) {
        return Flux.fromIterable(project.getOffers())
                .flatMap(offer -> Flux.fromIterable(offer.getInsured()));
    }

    @Override
    public Flux<Insured> getMainInsuredFromProject(Project project) {
        return Flux.fromIterable(project.getOffers())
                .flatMap(offer -> Flux.fromIterable(offer.getInsured())
                .filter(insured -> insured.getStatus() == InsuredStatus.MAIN_INSURED));
    }

}
