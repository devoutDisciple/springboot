package com.beiwosi.guangzhou;

import com.beiwosi.guangzhou.modal.repo.GoodsEntityRepository;
import com.beiwosi.guangzhou.modal.vo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GuangzhouApplicationTests {

    @Autowired
    Person person;

    @Autowired
    GoodsEntityRepository goodsEntityRepository;

    @Test
    public void contextLoads() {

        System.out.println(person);
    }

    @Autowired
    JavaMailSender javaMailSender;

    @Test
    public void testSendEmail() {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            message.setFrom("1094705507@qq.com");
            message.setTo("228827325@qq.com");
            message.setSubject("测试主体2222");
            message.setText("测试内容");
            javaMailSender.send(mimeMessage);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
