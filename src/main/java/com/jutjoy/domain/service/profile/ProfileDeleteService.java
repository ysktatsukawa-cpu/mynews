package com.jutjoy.domain.service.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jutjoy.domain.mapper.ProfileMapper;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProfileDeleteService {

    @Autowired
    private ProfileMapper ProfileMapper;

    public void delete(Integer id) {

        // 自己紹介削除処理
    	ProfileMapper.delete(id);

        }
    }