package com.himedia.project_1.controller;

import com.himedia.project_1.service.BusinessService;
import com.himedia.project_1.dto.BusinessmanVo;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.ibatis.session.SqlSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.stereotype.Controller;

@Controller
public class BusinessController {

    private BusinessService businessService;

    public BusinessController(SqlSession sqlSession) {
        this.businessService = new BusinessService(sqlSession);
    }

    // 특정 사업자의 정보를 조회하여 JSP로 전달
    @GetMapping("/business/{id}")
    public String getBusinessInfo(@PathVariable String id, HttpServletRequest request) {
        BusinessmanVo business = businessService.getBusinessInfo(id);
        request.setAttribute("business", business);
        return "businessProfile"; // businessProfile.jsp로 포워딩
    }
}
