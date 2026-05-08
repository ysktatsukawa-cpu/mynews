package com.jutjoy.domain.entity.profile;

import java.sql.Timestamp;
import java.util.List;

import lombok.Data;

@Data
public class Profile {

    private Integer id;

    private String name;

    private String gender;

    private String hobby;

    private String introduction;

    private Timestamp registeredDate;

    private Timestamp updatedDate;
    
    private List<ProfileHistories> histories;
    
}