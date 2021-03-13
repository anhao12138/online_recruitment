package com.example.online_re.mapper;

import com.example.online_re.domain.B;

public interface BMapper {

    int deleteByPrimaryKey(Integer bid);

    int insert(B record);

    int insertSelective(B record);

    B selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(B record);

    int updateByPrimaryKey(B record);
}