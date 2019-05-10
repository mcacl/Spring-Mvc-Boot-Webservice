package com.example.demo.dao;

import com.example.demo.model.POS_INFO;

public interface IPos_InfoService
{
    int deleteByPrimaryKey(Integer posId);

    int insert(POS_INFO record);

    int insertSelective(POS_INFO record);

    POS_INFO selectByPrimaryKey(Integer posId);

    int updateByPrimaryKeySelective(POS_INFO record);

    int updateByPrimaryKey(POS_INFO record);
}