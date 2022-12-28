package com.jsframe.laundry.dto;

import lombok.Data;

@Data
public class ProductDto {
    private int product_number;
    private String product_name;
    private int product_price;
    private int product_group;
}
