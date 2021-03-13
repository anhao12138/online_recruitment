package com.example.online_re.mapper;

import com.example.online_re.domain.C;

public interface CMapper {
    int insert(C record);

    int insertSelective(C record);
}