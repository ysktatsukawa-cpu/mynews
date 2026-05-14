package com.jutjoy.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jutjoy.domain.entity.news.NewsHistories;

@Mapper
public interface NewsHistoriesMapper {

    /**
     * 履歴登録
     */
    int insert(NewsHistories newsHistories);
    
    
    /**
     * 履歴一覧
     */
    List<NewsHistories> findByNewsId(@Param("id") Integer id);
    
    
    /**
     * 履歴削除
     */
    int deleteHistory(@Param("id") Integer id);
}