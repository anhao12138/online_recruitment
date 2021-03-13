package com.example.online_re.mapper;

import com.example.online_re.domain.JobTitle;

public interface JobTitleMapper {
    int deleteByPrimaryKey(Integer jobid);

    int insert(JobTitle record);

    int insertSelective(JobTitle record);

    JobTitle selectByPrimaryKey(Integer jobid);

    int updateByPrimaryKeySelective(JobTitle record);

    int updateByPrimaryKey(JobTitle record);
}