package com.himedia.project_1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("/product")

public class ProductController {
    @GetMapping("/productDetail")
    public String productDetail() {
        return "product/productDetail";
    }
}
