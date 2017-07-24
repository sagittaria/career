package com.springinaction.knights;

//import com.springinaction.knights.KnightConfig;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {
        // RescueDamselQuest quest = new RescueDamselQuest();
        // BraveKnight bk = new BraveKnight(quest);
        // bk.embarkOnQuest();
        // 普通注入quest

        // Knight k = new KnightConfig().knight();
        // k.embarkOnQuest();
        // 对应于用KnightConfig.java配置，但感觉不该这么用

        // 对应于用knight.XML配置的情况
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springinaction/knights/knight.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
