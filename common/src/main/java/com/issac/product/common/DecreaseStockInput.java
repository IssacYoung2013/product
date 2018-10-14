package com.issac.product.common;

import lombok.Data;

/**
 * author:  ywy
 * date:    2018-10-13
 * desc:
 */
@Data
public class DecreaseStockInput {
    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
