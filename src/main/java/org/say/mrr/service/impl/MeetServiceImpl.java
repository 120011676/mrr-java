package org.say.mrr.service.impl;

import org.say.mrr.dao.MeetDao;
import org.say.mrr.entity.MeetEntity;
import org.say.mrr.service.MeetService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MeetServiceImpl implements MeetService {

    @Resource
    private MeetDao meetDao;

    @Override
    public int save(MeetEntity meet) {
        return this.meetDao.save(meet);
    }
}
