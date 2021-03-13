package com.example.online_re.service.impl;

import com.example.online_re.domain.A;
import com.example.online_re.mapper.AMapper;
import com.example.online_re.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Date 2021/3/13 15:31
 * @Version 1.0
 */
@Service
public class JobServiceImpl implements JobService {

    @Autowired
    AMapper aMapper;

    @Override
    public List<A> list() {
        return aMapper.list();
    }
}
