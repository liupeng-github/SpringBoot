package cloud.liupeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * SpringBoot整合Kafka
 *
 * @author liupeng
 */
@EnableScheduling
@SpringBootApplication
public class LpCloudKafkaApplication {
    public static void main(String[] args) {
        SpringApplication.run(LpCloudKafkaApplication.class, args);
    }
}
