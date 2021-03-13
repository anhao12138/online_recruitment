package com.example.online_re.mapper;

import com.example.online_re.domain.JobSearch;
import org.apache.ibatis.annotations.Select;

public interface JobSearchMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobSearch record);

    int insertSelective(JobSearch record);

    JobSearch selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobSearch record);

    int updateByPrimaryKey(JobSearch record);

    @Select("SELECT COUNT(*) FROM job_search")
    int FindJobSearch();
}