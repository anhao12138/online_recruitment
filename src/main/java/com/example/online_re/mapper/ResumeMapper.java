package com.example.online_re.mapper;

import com.example.online_re.domain.Resume;
import java.math.BigDecimal;

public interface ResumeMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Resume record);

    int insertSelective(Resume record);

    Resume selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Resume record);

    int updateByPrimaryKey(Resume record);
}