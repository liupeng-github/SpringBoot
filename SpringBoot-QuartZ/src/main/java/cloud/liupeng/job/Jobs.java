package cloud.liupeng.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SpringBoot整合QuartZ
 *
 * @author liupeng
 */
@Component
public class Jobs {

    @Scheduled(fixedRate = 1000)
    public void run() {
        String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(date);
    }
}
