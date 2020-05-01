package cloud.liupeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * SpringBoot整合Redis
 * @EnableCaching 开启缓存
 * @author liupeng
 */
@EnableCaching
@SpringBootApplication
public class LpCloudRedisApplication {
    public static void main(String[] args) {
        SpringApplication.run(LpCloudRedisApplication.class, args);
    }
}
