package com.issac.product.common.util;

import com.issac.product.common.enums.CodeEnum;

/**
 * @author Issac
 *  *   @date    2018-09-15
 * @desc
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each :
                enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
