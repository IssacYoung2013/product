package com.issac.product.common;

import com.issac.product.common.enums.ResultEnum;
import lombok.Getter;

/**
 * author:  ywy
 * date:  2018-08-31
 * desc:
 */
@Getter
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }


    public ProductException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }
}