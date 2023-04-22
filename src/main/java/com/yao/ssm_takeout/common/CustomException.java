package com.yao.ssm_takeout.common;

/**
 * 自定义业务异常
 */

public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
