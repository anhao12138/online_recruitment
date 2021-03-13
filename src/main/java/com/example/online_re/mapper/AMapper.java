package com.example.online_re.mapper;

import com.example.online_re.domain.A;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AMapper {
    /**
     * 职位表
     * @param aid
     * @return
     */
    int deleteByPrimaryKey(Integer aid);

    int insert(A record);

    int insertSelective(A record);

    A selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(A record);

    int updateByPrimaryKey(A record);

    @Select("select * FROM a LEFT JOIN b ON a.aid=b.b_id LEFT JOIN c ON b.b_id=c.c_id")
     List<A> list();
}