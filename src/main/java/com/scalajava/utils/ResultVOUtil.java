package com.scalajava.utils;

/**
 * 返回值工具类
 * */
public class ResultVOUtil {
    public static ResultVo success(Object object){
        ResultVo resultVo = new ResultVo();
        resultVo.setData(object);
        resultVo.setCode(666);
        resultVo.setMsg("success");
        return  resultVo;
    }

    public static ResultVo success(){
        return  success(null);
    }

    public static ResultVo error(Integer code, String msg){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return  resultVo;
    }
}
