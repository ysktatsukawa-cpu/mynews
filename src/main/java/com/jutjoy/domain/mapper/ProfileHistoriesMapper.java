package com.jutjoy.domain.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.jutjoy.domain.entity.profile.ProfileHistories;

@Mapper
public interface ProfileHistoriesMapper {

    /**
     * 履歴登録
     */
    int insert(ProfileHistories profileHistories);

}