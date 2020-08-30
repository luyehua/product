package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;

/**
 * @author: lu
 * @date: 2020-08-27 09:29
 **/
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
