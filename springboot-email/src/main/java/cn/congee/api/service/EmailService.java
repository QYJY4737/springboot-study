package cn.congee.api.service;

/**
 * @Author: yang
 * @Date: 2020-12-08 7:01
 */
public interface EmailService {

    void sendSimpleMail();

    void sendHtmlMail();

    void sendAttachmentsMail();

    void sendInlineMail();

    void sendTemplateMail();

}
