package com.example.online_re.mapper;

import com.example.online_re.domain.UserAdmin;
import org.apache.ibatis.annotations.Select;

public interface UserAdminMapper {
    int deleteByPrimaryKey(Integer applyid);

    int insert(UserAdmin record);

    int insertSelective(UserAdmin record);

    UserAdmin selectByPrimaryKey(Integer applyid);

    int updateByPrimaryKeySelective(UserAdmin record);

    int updateByPrimaryKey(UserAdmin record);

    @Select("select * from user_admin where name=#{name}")
        UserAdmin selectList(String name);

    public UserAdmin findUsersByUsername(String name);

}