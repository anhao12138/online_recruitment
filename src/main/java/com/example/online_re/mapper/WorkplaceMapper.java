package com.example.online_re.mapper;

import com.example.online_re.domain.Workplace;

public interface WorkplaceMapper {
    int deleteByPrimaryKey(Integer wId);

    int insert(Workplace record);

    int insertSelective(Workplace record);

    Workplace selectByPrimaryKey(Integer wId);

    int updateByPrimaryKeySelective(Workplace record);

    int updateByPrimaryKey(Workplace record);
}