package com.jutjoy.domain.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jutjoy.domain.entity.news.NewsHistories;

@Mapper
public interface NewsHistoriesMapper {

    /**
     * 履歴登録
     */
    int insert(NewsHistories newsHistories);
}