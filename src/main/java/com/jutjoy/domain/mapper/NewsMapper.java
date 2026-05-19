package com.jutjoy.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jutjoy.domain.entity.news.News;

@Mapper
public interface NewsMapper {

    /**
     * ニュース一覧取得
     */
    List<News> findAllOrderById();

    /**
     * タイトル検索
     */
    List<News> findByTitleLike(@Param("title") String title);

    /**
     * ID検索
     */
    News selectById(@Param("id") Integer id);

    /**
     * 登録
     */
    int insert(News news);

    /**
     * 更新
     */
    int update(News news);

    /**
     * 削除
     */
    int delete(@Param("id") Integer id);
}


