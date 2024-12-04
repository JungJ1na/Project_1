package com.himedia.project_1.service;

import com.himedia.project_1.dao.IBusinessDao;
import com.himedia.project_1.dto.BusinessmanVo;
import org.apache.ibatis.session.SqlSession;

public class BusinessService {
    private IBusinessDao businessDao;

    public BusinessService(SqlSession sqlSession) {
        businessDao = sqlSession.getMapper(IBusinessDao.class);
    }

    // 사업자 정보를 가져오는 메서드
    public BusinessmanVo getBusinessInfo(String id) {
        return businessDao.getBusinessInfo(Integer.parseInt(id));
    }
}
