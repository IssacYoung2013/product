package com.issac.product.server.service;

import com.issac.product.common.DecreaseStockInput;
import com.issac.product.server.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 *
 * author:  ywy
 * date:  2018-08-30
 * desc:
 *
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 查询在架的商品
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfo> findList(List<String> productIdList);

    ProductInfo save(ProductInfo productInfo);

    // 加库存
    void increaseStock(List<DecreaseStockInput> decreaseStockInputList);

    // 减库存
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);

    // 上架
    ProductInfo onSale(String productId);

    // 下架
    ProductInfo offSale(String productId);
}