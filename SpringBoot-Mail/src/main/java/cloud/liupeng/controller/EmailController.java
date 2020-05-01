package cloud.liupeng.controller;

import cloud.liupeng.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

/**
 * @author liupeng
 */
@RestController
public class EmailController {

    private static final String SEND_TO = "liupeng@qq.com";
    private static final String TITLE = "邮件标题：你好！";
    private static final String TEXT = "这是一封邮件！请注意查收！";
    private static final File FILES = new File("/usr/local/application/springboot/***.jpg");
    private static final String TEMPLATE = "index.html";


    @Autowired
    private EmailService emailService;

    /**
     * 发送文本邮件
     *
     * @return
     */
    @RequestMapping("/sendSimpleMail")
    public String sendSimpleMail() {
        emailService.sendSimpleMail(SEND_TO, TITLE, TEXT);
        return "success";
    }

    /**
     * 发送附件邮件
     *
     * @return
     */
    @RequestMapping("/sendAttachmentMail")
    public String sendAttachmentMail() {
        emailService.sendAttachmentMail(SEND_TO, TITLE, TEXT, FILES);
        return "success";
    }

    /**
     * 发送模板邮件
     *
     * @return
     */
    @RequestMapping("/sendTemplateMail")
    public String sendTemplateMail() {
        emailService.sendTemplateMail(SEND_TO, TITLE, TEMPLATE);
        return "success";
    }
}
