package com.lh.aigou_common_parent.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lzl
 * @date 2018/4/4
 */
@ApiModel("全局返回消息")
@Data
public final class ResponseBean<T> implements Serializable {
    private static final long serialVersionUID = 6962979967123999567L;

    /**
     * http 状态码  默认是成功
     */
    @ApiModelProperty("状态码")
    private int code = 200;
    /**
     * 是否成功
     */
    @ApiModelProperty("是否成功")
    private boolean success;
    /**
     * 返回信息
     */
    @ApiModelProperty("信息")
    private String msg;
    /**
     * 返回的数据
     */
    @ApiModelProperty("数据<泛型>")
    private T data;

    /**
     * 成功状态下的信息
     */
    public ResponseBean(T data) {
        this.success = true;
        this.data = data;
    }

    /**
     * 成功状态下的信息
     */
    public ResponseBean(String msg, T data) {
        this.success = true;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 其他状态
     */
    public ResponseBean(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
