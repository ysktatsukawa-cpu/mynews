package com.jutjoy.domain.service.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jutjoy.domain.entity.profile.Profile;
import com.jutjoy.domain.entity.profile.ProfileHistories;
import com.jutjoy.domain.form.ProfileEditForm;
import com.jutjoy.domain.mapper.ProfileHistoriesMapper;
import com.jutjoy.domain.mapper.ProfileMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Transactional
@Service
public class ProfileEditService {

    @Autowired
    private ProfileMapper ProfileMapper;
    
    @Autowired
    private ProfileHistoriesMapper ProfileHistoriesMapper;

    public void edit(int id, ProfileEditForm form) {;

        Profile entity = ProfileMapper.selectById(id);

        // ニュース更新処理
        Profile profile = editProfile(entity, form);
        
        // ニュース編集履歴登録
        registerHistory(entity.getId());
    }

    public Profile findProfile(int id) {

        // プロフィール編集履歴参照
        Profile profile = ProfileMapper.selectById(id);
        profile.setHistories(ProfileHistoriesMapper.findByProfileId(id));
        
        return profile;
    }

    private Profile editProfile(Profile entity, ProfileEditForm form) {

        entity.setName(form.getName());
        entity.setGender(form.getGender());
        entity.setHobby(form.getHobby());
        entity.setIntroduction(form.getIntroduction());
        
        ProfileMapper.update(entity);
        return entity;
    }
    
    private void registerHistory(Integer id) {
        ProfileHistories entity = new ProfileHistories();
        entity.setProfileId(id);
        ProfileHistoriesMapper.insert(entity);
    }

}