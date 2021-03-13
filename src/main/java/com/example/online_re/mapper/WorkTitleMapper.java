package com.example.online_re.mapper;

import com.example.online_re.domain.WorkTitle;

public interface WorkTitleMapper {
    int deleteByPrimaryKey(Integer wordId);

    int insert(WorkTitle record);

    int insertSelective(WorkTitle record);

    WorkTitle selectByPrimaryKey(Integer wordId);

    int updateByPrimaryKeySelective(WorkTitle record);

    int updateByPrimaryKey(WorkTitle record);
}