package com.testReactor.demo.Service.ServiceImpl;

import com.testReactor.demo.Models.Insured;
import com.testReactor.demo.Models.Project;
import reactor.core.publisher.Flux;

public class InsuredServiceImpl implements InsuredService{

    @Override
    public Flux<Insured> getAllInsured(Project project) {
        return Flux.fromIterable(project.getOffers())
                .flatMap(offer -> Flux.fromIterable(offer.getInsured()));
    }

}
