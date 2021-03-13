package com.example.online_re.mapper;

import com.example.online_re.domain.Position;
import java.math.BigDecimal;

public interface PositionMapper {
    int deleteByPrimaryKey(BigDecimal id);

    int insert(Position record);

    int insertSelective(Position record);

    Position selectByPrimaryKey(BigDecimal id);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKeyWithBLOBs(Position record);

    int updateByPrimaryKey(Position record);
}