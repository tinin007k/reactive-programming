package org.reactive.first;

import reactor.core.publisher.Mono;

public class FirstReactiveProgram {

    public Mono<String> fruitMono() {
        return Mono.just("Mango").log();
    }

    public static void main(String[] args) {

        FirstReactiveProgram fluxAndMonoServices
                = new FirstReactiveProgram();

        fluxAndMonoServices.fruitMono()
                .subscribe(s -> {
                    System.out.println("Mono -> s = " + s);
                });
    }
}
