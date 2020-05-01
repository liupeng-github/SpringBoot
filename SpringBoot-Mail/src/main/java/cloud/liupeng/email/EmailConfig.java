package cloud.liupeng.email;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author liupeng
 */
@Data
@Component
public class EmailConfig {

    @Value("${spring.mail.username}")
    private String emailFrom;
}
