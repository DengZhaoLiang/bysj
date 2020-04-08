package com.liang.service;

import javax.mail.MessagingException;
import org.springframework.scheduling.annotation.Async;

/**
 * @author Liang
 * SendMail  2020/1/30 0030 13:50 Liang
 */
public interface SendMailService {
    /**
     * SimpleMailMessage
     * 发送简单邮件
     *
     * @param subject 邮件主题
     * @param text    邮件内容
     * @param from    发件人
     * @param to      收件人
     */
    @Async
    void simpleSend(String subject, String text, String from, String to);

    /**
     * MimeMailMessage
     * 发送复杂邮件
     *
     * @param subject  邮件主题
     * @param text     邮件内容
     * @param html     是否解析html文本
     * @param fileName 附件名
     * @param pathName 附件本地路径
     * @param from     发件人
     * @param to       收件人
     * @throws MessagingException 抛出
     */
    @Async
    void MimeSend(String subject, String text, Boolean html, String fileName, String pathName, String from, String to) throws MessagingException;
}
