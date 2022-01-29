package com.njxzc.mybatisplus.entity;

import lombok.Data;

/**
 * projectName:  mybatisplus
 * packageName: com.njxzc.mybatisplus.entity
 * date: 2022-01-28 22:52
 * copyright(c) 2020 南晓18卓工 邱依良
 *
 * @author 邱依良
 */
@Data
public class Goods {
    private Integer id;
    private String goodsName;
    private Double goodsPrice;
    private Integer goodsNum;
}
