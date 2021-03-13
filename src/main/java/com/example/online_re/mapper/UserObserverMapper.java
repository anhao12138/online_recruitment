package com.example.online_re.mapper;

import com.example.online_re.domain.UserObserver;

public interface UserObserverMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserObserver record);

    int insertSelective(UserObserver record);

    UserObserver selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserObserver record);

    int updateByPrimaryKey(UserObserver record);
}