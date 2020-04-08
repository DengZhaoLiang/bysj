package com.liang.service;

import java.io.File;
import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

/**
 * @author Liang
 */
@Service
public class SendMailServiceImpl implements SendMailService {

    @Resource
    JavaMailSenderImpl javaMailSenderImpl;

    @Override
    public void simpleSend(String subject, String text, String from, String to) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject(subject);
        message.setText(text);
        message.setFrom(from);
        message.setTo(to);
        javaMailSenderImpl.send(message);
    }

    @Override
    public void MimeSend(String subject, String text, Boolean html, String fileName, String pathName, String from, String to) throws MessagingException {
        MimeMessage mimeMessage = javaMailSenderImpl.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        helper.setSubject(subject);
        helper.setText(text, html);
        helper.setFrom(from);
        helper.setTo(to);
        helper.addAttachment(fileName, new File(pathName));
        javaMailSenderImpl.send(mimeMessage);
    }

}
