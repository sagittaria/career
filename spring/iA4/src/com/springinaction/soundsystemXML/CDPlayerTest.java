package com.springinaction.soundsystemXML;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("ch2sec4.xml")//加载指定的xml配置文件！
public class CDPlayerTest {
    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private MediaPlayer cdPlayer;

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(compactDisc);
    }

    @Test
    public void play() {
        cdPlayer.play();
    }
}
