package com.zeyushen.springboot01.app.mapper;

import com.zeyushen.springboot01.app.model.PactInfoPojo;

public interface PactInfoPojoMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(PactInfoPojo record);

    int insertSelective(PactInfoPojo record);

    PactInfoPojo selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(PactInfoPojo record);

    int updateByPrimaryKey(PactInfoPojo record);
}