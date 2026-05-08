package com.jutjoy.domain.entity.news;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class NewsHistories {

    private Integer id;

    private Integer newsId;

    private Timestamp editedDate;
}