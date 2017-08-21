package org.say.mrr.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class MeetEntity implements Serializable {
    private Integer id;
    private String city;
    private String floor;
    private String room;
    private String conferenceName;
    private String people;
    private String phone;
    private String password;
    private Date startDate;
    private Date endDate;
    private Date createDate;
}
