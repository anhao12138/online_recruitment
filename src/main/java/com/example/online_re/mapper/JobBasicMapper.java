package com.example.online_re.mapper;

import com.example.online_re.domain.JobBasic;

public interface JobBasicMapper {
    int deleteByPrimaryKey(Integer basicId);

    int insert(JobBasic record);

    int insertSelective(JobBasic record);

    JobBasic selectByPrimaryKey(Integer basicId);

    int updateByPrimaryKeySelective(JobBasic record);

    int updateByPrimaryKey(JobBasic record);
}