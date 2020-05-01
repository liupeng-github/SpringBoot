package cloud.liupeng.service.impl;

import cloud.liupeng.email.EmailConfig;
import cloud.liupeng.service.EmailService;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author liupeng
 */
@Service("emailService")
public class EmailServiceImpl implements EmailService {

    @Autowired
    private EmailConfig emailConfig;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    /**
     * 邮件发送
     *
     * @param sendTo:接收者
     * @param title:标题
     * @param text:内容
     */
    @Override
    public void sendSimpleMail(String sendTo, String title, String text) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        /**
         * 发送者
         */
        simpleMailMessage.setFrom(emailConfig.getEmailFrom());
        /**
         * 接收者
         */
        simpleMailMessage.setTo(sendTo);
        /**
         * 邮件标题
         */
        simpleMailMessage.setSubject(title);
        /**
         * 邮件内容
         */
        simpleMailMessage.setText(text);
        /**
         * 发送邮件
         */
        javaMailSender.send(simpleMailMessage);
    }

    /**
     * 发送带附件邮件
     *
     * @param sendTo:接收者
     * @param title:标题
     * @param text:内容
     * @param file:附件
     */
    @Override
    public void sendAttachmentMail(String sendTo, String title, String text, File file) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(emailConfig.getEmailFrom());
            mimeMessageHelper.setTo(sendTo);
            mimeMessageHelper.setSubject(title);
            mimeMessageHelper.setText(text);

            /**
             * 添加附件
             */
            FileSystemResource fileSystemResource = new FileSystemResource(file);
            mimeMessageHelper.addAttachment("附件", fileSystemResource);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);
    }

    /**
     * 发送模板邮件
     *
     * @param sendTo:接收者
     * @param title:标题
     * @param templateInfo:模板
     */
    @Override
    public void sendTemplateMail(String sendTo, String title, String templateInfo) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(emailConfig.getEmailFrom());
            mimeMessageHelper.setTo(sendTo);
            mimeMessageHelper.setSubject(title);

            /**
             * 封装模板使用的数据
             */
            Map<String, Object> model = new HashMap<>();
            model.put("username", "刘鹏");
            /**
             * 获得模板
             */
            Template template = freeMarkerConfigurer.getConfiguration().getTemplate(templateInfo);
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
            mimeMessageHelper.setText(html, true);
        } catch (MessagingException | IOException | TemplateException e) {
            e.printStackTrace();
        }
        javaMailSender.send(mimeMessage);
    }
}
