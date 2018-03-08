package br.com.marceloserpa.actuator.kafka.poc.healthchecks;

import br.com.marceloserpa.actuator.kafka.poc.kafka.KafkaConsumerHealthChecker;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;


@Component
public class KafkaConsumerHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean isUp = new KafkaConsumerHealthChecker().check();
        return isUp ? Health.up().build() : Health.outOfService().build();
    }

}
