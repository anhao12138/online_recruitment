package com.example.online_re.mapper;

import com.example.online_re.domain.Development;

public interface DevelopmentMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Development record);

    int insertSelective(Development record);

    Development selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Development record);

    int updateByPrimaryKey(Development record);
}