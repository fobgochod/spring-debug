package com.fobgochod.annotation.namespace;

import com.fobgochod.annotation.namespace.handler.AnimeInfo;
import com.fobgochod.annotation.namespace.handler.ExtendClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class NamespaceXmlApplication {

    public static void main(String[] args) {

        ApplicationContext ac = new ExtendClassPathXmlApplicationContext("classpath:config/annotation/anime.xml");
        AnimeInfo animeInfo = ac.getBean(AnimeInfo.class);
        System.out.println("animeInfo = " + animeInfo);
    }
}
