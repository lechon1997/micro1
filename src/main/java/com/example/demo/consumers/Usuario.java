package com.example.demo.consumers;

import com.example.demo.config.MensajesSuma;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Usuario {

    @RabbitListener(queues = MensajesSuma.QUEUE)
    public void consumeMessageFromQueue(String mensaje) {
        System.out.println("SUMA MENSAJE: " + mensaje);
    }
}
