package com.example.online_re.service.impl;

import com.example.online_re.domain.JobSearch;
import com.example.online_re.mapper.JobSearchMapper;
import com.example.online_re.service.JobSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date 2021/3/13 15:49
 * @Version 1.0
 */
@Service
public class JobSearchServiceImpl implements JobSearchService {

    @Autowired
    private JobSearchMapper jobSearch;
    /**
     * 职位订阅
     *
     * @param jobSearch
     */
    @Override
    public int AddJobSearch(JobSearch jobSearch) {
        return baseMappper.;
    }

    /**
     * 查询订阅职位总人数
     */
    @Override
    public int FindJobSearch() {
        return 0;
    }
}
