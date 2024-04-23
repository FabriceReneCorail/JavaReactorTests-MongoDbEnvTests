package com.testReactor.demo.Service.ServiceImpl;

import com.testReactor.demo.Models.Insured;
import org.springframework.data.repository.CrudRepository;
import reactor.core.publisher.Mono;

public interface InsuredService extends CrudRepository {
    Mono<Insured> getMainInsured();
}
