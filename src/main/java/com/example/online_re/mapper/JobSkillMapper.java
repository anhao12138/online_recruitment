package com.example.online_re.mapper;

import com.example.online_re.domain.JobSkill;

public interface JobSkillMapper {
    int deleteByPrimaryKey(Integer joboneid);

    int insert(JobSkill record);

    int insertSelective(JobSkill record);

    JobSkill selectByPrimaryKey(Integer joboneid);

    int updateByPrimaryKeySelective(JobSkill record);

    int updateByPrimaryKey(JobSkill record);
}