package com.jutjoy.domain.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jutjoy.domain.entity.profile.Profile;
import com.jutjoy.domain.entity.profile.ProfileHistories;

@Mapper
public interface ProfileMapper {

    /**
     * 一覧取得
     */
    List<Profile> findAllOrderById();
    
    List<ProfileHistories> findByProfileId(@Param("id") Integer id);
    
    /**
     * 名前検索
     */
    List<Profile> findByNameLike(@Param("name") String name);

    /**
     * ID検索
     */
    Profile selectById(@Param("id") Integer id);

    /**
     * 登録
     */
    int insert(Profile profile);

    /**
     * 更新
     */
    int update(Profile profile);
    

    /**
     * 削除
     */
    int delete(@Param("id") Integer id);
    
}