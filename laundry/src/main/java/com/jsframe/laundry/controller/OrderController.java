package com.jsframe.laundry.controller;

import com.jsframe.laundry.dto.ProductDto;
import com.jsframe.laundry.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Log
@RequestMapping("/laundry")
@RequiredArgsConstructor
public class OrderController {

    private static final Logger logger
            = LoggerFactory.getLogger(OrderController.class);

    private final ProductService ProductService;


    @RequestMapping("optionInfo")
    @ResponseBody
    public ProductDto optionInfo(@RequestParam (value="no")int itemNo , Model model, ProductDto vo){
        logger.info("파라미터 itemNo ={}",itemNo);

        vo = ProductService.selectByNo(itemNo);
        logger.info("no로 categoryVO 조회 vo ={}",vo);

        return vo;

    }
    @RequestMapping("/orderSelect")
    public String cgSelect(@RequestParam int ProductGroup, Model model) {
        logger.info("카테고리그룹 별 조회 파라미터 groupName={}", ProductGroup);

        List<ProductDto> list = ProductService.selectAllProduct(ProductGroup);
        logger.info("그룹 별 카테고리 조회 결과 list.size={}",list.size());

        model.addAttribute("list", list);

        return "order/orderSelect";
    }


}
