package com.example.online_re.mapper;

import com.example.online_re.domain.ImageAds;

public interface ImageAdsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImageAds record);

    int insertSelective(ImageAds record);

    ImageAds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImageAds record);

    int updateByPrimaryKey(ImageAds record);
}