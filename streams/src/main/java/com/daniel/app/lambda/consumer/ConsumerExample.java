package com.daniel.app.lambda.consumer;

import java.lang.System;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        /**
         *  Consumer
         *  Recibe un valor y no retorna nada
         */

        // Multiline version
        // Consumer<String> consumer = (param) -> {
        //     System.out.println(param);
        // };

        // In-line version
        // Consumer<String> consumer = (param) -> System.out.println(param);

        // Min version
        Consumer<String> consumer = System.out::println;
        consumer.accept("Daniel");
    }
}