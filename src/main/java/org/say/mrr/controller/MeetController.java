package org.say.mrr.controller;

import org.say.mrr.entity.MeetEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MeetController {

    @RequestMapping("reserve")
    public String reserve(MeetEntity reserveEntity) {
        return null;
    }

    @RequestMapping("cancel")
    public String cancel(Integer id, String password) {
        return null;
    }

    @RequestMapping("query")
    public String query(String city, String floor, String room, Date startDate, Date endDate) {
        return null;
    }
}
