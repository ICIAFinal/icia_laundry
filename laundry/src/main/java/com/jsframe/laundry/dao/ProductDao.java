package com.jsframe.laundry.dao;

import com.jsframe.laundry.dto.ProductDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductDao {
    public List<Map<String, Object>> selectAllProductGroup();
    public List<ProductDto> selectAllProduct(int ProductGroup);
    public ProductDto selectByNo(int no);
}
