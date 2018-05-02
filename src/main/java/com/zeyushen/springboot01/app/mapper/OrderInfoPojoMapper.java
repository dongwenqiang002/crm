package com.zeyushen.springboot01.app.mapper;

import com.zeyushen.springboot01.app.model.OrderInfoPojo;

public interface OrderInfoPojoMapper {
    int deleteByPrimaryKey(Integer oId);

    int insert(OrderInfoPojo record);

    int insertSelective(OrderInfoPojo record);

    OrderInfoPojo selectByPrimaryKey(Integer oId);

    int updateByPrimaryKeySelective(OrderInfoPojo record);

    int updateByPrimaryKey(OrderInfoPojo record);
}