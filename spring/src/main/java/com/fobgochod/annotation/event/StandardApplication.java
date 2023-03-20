package com.fobgochod.annotation.event;

import com.fobgochod.annotation.circularreference.CycleApplication;
import com.fobgochod.annotation.event.annotation.AnnotationBlockedListNotifier;
import com.fobgochod.annotation.event.standard.BlockedListNotifier;
import com.fobgochod.annotation.event.standard.EmailService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.fobgochod.annotation.event")
public class StandardApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(StandardApplication.class);
        ac.refresh();

        BlockedListNotifier blockedListNotifier = ac.getBean(BlockedListNotifier.class);
        blockedListNotifier.setNotificationAddress("blockedlist@example.org");

        AnnotationBlockedListNotifier annotationBlockedListNotifier = ac.getBean(AnnotationBlockedListNotifier.class);
        annotationBlockedListNotifier.setNotificationAddress("annotationblockedlist@example.org");

        EmailService emailService = ac.getBean(EmailService.class);
        emailService.setBlockedList(Arrays.asList("known.spammer@example.org", "known.hacker@example.org", "john.doe@example.org"));

        emailService.sendEmail("john.doe@example.org", "你好，测试。");
    }
}
