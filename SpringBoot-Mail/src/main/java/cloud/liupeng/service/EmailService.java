package cloud.liupeng.service;

import java.io.File;

/**
 * @author liupeng
 */
public interface EmailService {

    /**
     * 发送文本邮件
     * @param sendTo:接收者
     * @param title:标题
     * @param text:内容
     */
    void sendSimpleMail(String sendTo, String title, String text);

    /**
     * 发送带附件邮件
     * @param sendTo:接收者
     * @param title:标题
     * @param text:内容
     * @param file:附件
     */
    void sendAttachmentMail(String sendTo, String title, String text, File file);

    /**
     * 发送模板邮件
     * @param sendTo:接收者
     * @param title:标题
     * @param templateInfo:模板
     */
    void sendTemplateMail(String sendTo, String title, String templateInfo);
}
