package com.springinaction.soundsystemMix;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:com/springinaction/soundsystemMix/cd-config.xml")
public class SoundSystemConfig {

}
