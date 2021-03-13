package com.example.online_re.mapper;

import com.example.online_re.domain.PositionGz;

public interface PositionGzMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PositionGz record);

    int insertSelective(PositionGz record);

    PositionGz selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PositionGz record);

    int updateByPrimaryKey(PositionGz record);
}