package com.jutjoy.domain.entity.news;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class News {

    private Integer id;

    private String title;

    private String content;

    private String imageName;

    private Timestamp registeredDate;

    private Timestamp updatedDate;
}