application.ymlpackage cloud.liupeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * SpringBoot整合QuartZ
 * @EnableScheduling 开启任务调度
 * @author liupeng
 */
@EnableScheduling
@SpringBootApplication
public class LpCloudQuartzApplication {
    public static void main(String[] args) {
        SpringApplication.run(LpCloudQuartzApplication.class, args);
    }
}
