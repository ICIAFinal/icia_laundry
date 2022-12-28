package com.jsframe.laundry.service.product;

import com.jsframe.laundry.dto.ProductDto;

import java.util.List;
import java.util.Map;

public interface ProductService {
    public List<Map<String, Object>> selectAllProductGroup();
    public List<ProductDto> selectAllProduct(int ProductGroup);
    public ProductDto selectByNo(int no);
}
