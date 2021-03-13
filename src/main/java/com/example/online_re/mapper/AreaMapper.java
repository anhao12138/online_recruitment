package com.example.online_re.mapper;

import com.example.online_re.domain.Area;

public interface AreaMapper {
    /**
     * 地区表
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}