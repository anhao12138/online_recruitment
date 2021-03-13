package com.example.online_re.mapper;

import com.example.online_re.domain.BossAdmin;

public interface BossAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BossAdmin record);

    int insertSelective(BossAdmin record);

    BossAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BossAdmin record);

    int updateByPrimaryKey(BossAdmin record);
}