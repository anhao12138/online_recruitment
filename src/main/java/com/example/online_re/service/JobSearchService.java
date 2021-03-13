package com.example.online_re.service;

import com.example.online_re.domain.JobSearch;

/**
 * @Date 2021/3/13 15:44
 * @Version 1.0
 */


public interface JobSearchService {
    /**
     * 职位订阅
     */
    int AddJobSearch(JobSearch jobSearch);
    /**
     * 查询订阅职位总人数
     */
    int FindJobSearch();
}
