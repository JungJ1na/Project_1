package com.himedia.project_1.dao;

import com.himedia.project_1.dto.BusinessmanVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IBusinessDao {
    BusinessmanVo getBusinessInfo(int businessId);
}
