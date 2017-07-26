package com.springinaction.soundsystemXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springinaction/soundsystemXML/ch2sec4.xml");
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.play();
        context.close();
    }
}
