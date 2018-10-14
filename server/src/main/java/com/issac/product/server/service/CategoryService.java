package com.issac.product.server.service;

import com.issac.product.server.dataobject.ProductCategory;

import java.util.List;

/**
 *
 * author:  ywy
 * date:  2018-08-29
 * desc:
 *
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}