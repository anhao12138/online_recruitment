package com.example.online_re.mapper;

import com.example.online_re.domain.Admin;

public interface AdminMapper {

    /**
     *管理员增删改查
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

}