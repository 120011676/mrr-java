package org.sqy.mrr.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.say.mrr.Application;
import org.say.mrr.entity.MeetEntity;
import org.say.mrr.service.MeetService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MeetServiceTest {

    @Resource
    private MeetService meetService;

    @Test
    public void testSave() {
        MeetEntity meet = new MeetEntity();
        Assert.notNull(this.meetService, "is null");
    }
}
