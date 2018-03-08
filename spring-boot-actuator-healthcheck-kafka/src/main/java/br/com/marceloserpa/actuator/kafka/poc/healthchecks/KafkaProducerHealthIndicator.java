package br.com.marceloserpa.actuator.kafka.poc.healthchecks;

import br.com.marceloserpa.actuator.kafka.poc.kafka.KafkaProducerHealthChecker;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducerHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        boolean isUp = new KafkaProducerHealthChecker().check();
        return isUp ? Health.up().build() : Health.outOfService().build();
    }

}
