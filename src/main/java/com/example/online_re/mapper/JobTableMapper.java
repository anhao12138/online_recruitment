package com.example.online_re.mapper;

import com.example.online_re.domain.JobTable;

public interface JobTableMapper {
    int insert(JobTable record);

    int insertSelective(JobTable record);
}