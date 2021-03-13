package com.example.online_re.mapper;

import com.example.online_re.domain.job;
import com.example.online_re.domain.jobWithBLOBs;

public interface jobMapper {
    int deleteByPrimaryKey(Long id);

    int insert(jobWithBLOBs record);

    int insertSelective(jobWithBLOBs record);

    jobWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(jobWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(jobWithBLOBs record);

    int updateByPrimaryKey(job record);
}