package com.example.online_re.mapper;

import com.example.online_re.domain.JobFirm;

public interface JobFirmMapper {
    int deleteByPrimaryKey(Integer firmId);

    int insert(JobFirm record);

    int insertSelective(JobFirm record);

    JobFirm selectByPrimaryKey(Integer firmId);

    int updateByPrimaryKeySelective(JobFirm record);

    int updateByPrimaryKey(JobFirm record);
}