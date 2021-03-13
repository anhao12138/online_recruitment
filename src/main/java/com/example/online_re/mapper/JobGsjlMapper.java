package com.example.online_re.mapper;

import com.example.online_re.domain.JobGsjl;

public interface JobGsjlMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobGsjl record);

    int insertSelective(JobGsjl record);

    JobGsjl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobGsjl record);

    int updateByPrimaryKey(JobGsjl record);
}