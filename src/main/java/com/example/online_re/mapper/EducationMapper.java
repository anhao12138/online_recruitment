package com.example.online_re.mapper;

import com.example.online_re.domain.Education;

public interface EducationMapper {
    int deleteByPrimaryKey(Integer eId);

    int insert(Education record);

    int insertSelective(Education record);

    Education selectByPrimaryKey(Integer eId);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}