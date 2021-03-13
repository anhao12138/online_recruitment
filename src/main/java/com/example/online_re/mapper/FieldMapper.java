package com.example.online_re.mapper;

import com.example.online_re.domain.Field;

public interface FieldMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(Field record);

    int insertSelective(Field record);

    Field selectByPrimaryKey(Integer fId);

    int updateByPrimaryKeySelective(Field record);

    int updateByPrimaryKey(Field record);
}