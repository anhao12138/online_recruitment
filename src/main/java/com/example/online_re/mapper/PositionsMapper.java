package com.example.online_re.mapper;

import com.example.online_re.domain.Positions;

public interface PositionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Positions record);

    int insertSelective(Positions record);

    Positions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Positions record);

    int updateByPrimaryKey(Positions record);
}