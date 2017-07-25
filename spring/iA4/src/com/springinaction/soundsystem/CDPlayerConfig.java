package com.springinaction.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
public class CDPlayerConfig {
    @Bean
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }
    
    @Bean
    public CDPlayer cdPlayer(CompactDisc cd){
        return new CDPlayer(sgtPeppers());
    }
}
