package com.jutjoy.domain.entity.profile;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ProfileHistories {

    private Integer id;

    private Integer profileId;

    private Timestamp editedDate;
}