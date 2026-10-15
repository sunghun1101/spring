package com.kdt.board;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class FareReadyRunner implements ApplicationRunner {
    private final FareService fareService;

    public FareReadyRunner(FareService fareService) {
        this.fareService = fareService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("fare ready" + this.fareService.price());
    }
}

