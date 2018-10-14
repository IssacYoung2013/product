package com.issac.product.client;

import com.issac.product.common.DecreaseStockInput;
import com.issac.product.common.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 *
 * author:  ywy
 * date:    2018-10-13
 * desc:
 */
@FeignClient(name = "product")
public interface ProductClient {

    /**
     * 获取商品订单
     * @param productIdList
     * @return
     */
    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);
}
