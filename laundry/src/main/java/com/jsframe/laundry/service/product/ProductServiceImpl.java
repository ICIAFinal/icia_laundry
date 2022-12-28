package com.jsframe.laundry.service.product;

import com.jsframe.laundry.dao.ProductDao;
import com.jsframe.laundry.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;

    @Override
    public List<Map<String, Object>> selectAllProductGroup(){
        return productDao.selectAllProductGroup();
    }
    @Override
    public List<ProductDto> selectAllProduct(int ProductGroup){
        return productDao.selectAllProduct(ProductGroup);
    }
    @Override
    public ProductDto selectByNo(int no){
        return productDao.selectByNo(no);
    }

}
