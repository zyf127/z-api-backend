package com.zyf.zapibackend.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

@Data
public class InterfaceInfoUpdateRequest implements Serializable {
    private static final long serialVersionUID = 3655063999204436105L;
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口状态（0-下线，1-上线）
     */
    private Integer status;

    /**
     * 请求类型
     */
    private String method;
}
