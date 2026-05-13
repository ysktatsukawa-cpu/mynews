package com.jutjoy.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jutjoy.domain.entity.profile.ProfileHistories;

@Mapper
public interface ProfileHistoriesMapper {

    /**
     * 履歴登録
     */
    int insert(ProfileHistories profileHistories);
    
    
    /**
     * 履歴一覧
     */
    List<ProfileHistories> findByProfileId(@Param("id") Integer id);
    
    
    /**
     * 履歴削除
     */
    int deleteHistory(@Param("id") Integer id);

}