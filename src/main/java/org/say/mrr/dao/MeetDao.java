package org.say.mrr.dao;

import org.apache.ibatis.annotations.Insert;
import org.say.mrr.entity.MeetEntity;

public interface MeetDao {

    @Insert("insert into meet(city,floor,room,conference_name,people,phone,password,start_date,end_date) value(#{city},#{floor},#{room),#{conferenceName},#{people},#{phone},#{password},#{startDate},,#{endDate}")
    int save(MeetEntity meet);

}
